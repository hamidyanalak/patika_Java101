import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen satır sayısını giriniz: ");
        int row = input.nextInt();
        System.out.print("Lütfen sütun sayısını giriniz: ");
        int col = input.nextInt();
        int realRow = row + 2;
        int realCol = col + 2;
        boolean isGameOn = true;
        boolean isWinV = false;

        String[][] cleanField = createField(realRow, realCol);
        String[][] gameArea = insertMines(cleanField);
        display(cleanField);
        System.out.println();
        //System.out.println("Mayınlı Alan: ");
        //display(gameArea);

        while(!isWinV && isGameOn){
            System.out.print("Lütfen açmak istediğiniz satırı seçiniz: ");
            int selectedRow = input.nextInt();
            System.out.print("Lütfen açmak istediğiniz sütunu seçiniz: ");
            int selectedCol = input.nextInt();

            if((selectedRow >= 0 && selectedCol >= 0) && (selectedRow < realRow && selectedCol < realCol)){
                if(gameArea[selectedRow][selectedCol] == " -  "){
                    int counter = 0;
                    if(gameArea[selectedRow][selectedCol+1] == " *  ") counter++;
                    if(gameArea[selectedRow+1][selectedCol] == " *  ") counter++;
                    if(gameArea[selectedRow+1][selectedCol+1] == " *  ") counter++;
                    if(gameArea[selectedRow-1][selectedCol-1] == " *  ") counter++;
                    if(gameArea[selectedRow-1][selectedCol] == " *  ") counter++;
                    if(gameArea[selectedRow-1][selectedCol+1] == " *  ") counter++;
                    if(gameArea[selectedRow][selectedCol-1] == " *  ") counter++;
                    if(gameArea[selectedRow+1][selectedCol-1] == " *  ") counter++;

                    cleanField[selectedRow][selectedCol] =" " + counter + "  ";
                    gameArea[selectedRow][selectedCol] =" " + counter + "  ";

                    display(cleanField);
                    System.out.println();

                    if (isWin(gameArea)) {
                        display(gameArea);
                        isWinV = true;
                    }
                    else isWinV = false;
                }
                else if(gameArea[selectedRow][selectedCol] == " *  "){
                    cleanField[selectedRow][selectedCol] =" *  ";
                    display(cleanField);
                    System.out.println("Mayına bastınız! Oyun bitti.");
                    display(gameArea);
                    isGameOn = false;
                }
                    else System.out.println("Burayı zaten açtınız! Lütfen başka bir konum giriniz.");
            }
            else System.out.println("Lütfen geçerli bir aralık giriniz!");
        }
    }
    public static String[][] createField(int row, int col) {
        String[][] cleanField = new String[row][col];

        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++){
                cleanField[i][j] = " -  ";
            }
        }
        return cleanField;
    }

    public static String[][] insertMines(String[][] matrix) {
        Random rand = new Random();

        String[][] mineField = new String[matrix.length][matrix[0].length];

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++){
                mineField[i][j] = " -  ";
            }
        }

        int row = matrix.length-2;
        int col = matrix[0].length-2;
        int counterMines = (row * col)/4;

        for(int i =0; i<counterMines; i++) {
            int randRow = 1 + rand.nextInt(row);
            int randCol = 1 + rand.nextInt(col);
            mineField[randRow][randCol] = " *  ";
            //Bazen aynı yer birden fazla kez mayınlanabiliyor, durumun farkındayım.
        }
        return mineField;
    }
    public static void display(String[][] matrix) { //ekrana yazdıran fonksiyon
        for(int i = 1; i < (matrix.length-1); i++) {
            for (int j = 1; j < (matrix[0].length-1); j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }
    public static void displayOriginal(String[][] matrix) { //ekrana yazdıran fonksiyon
        for(int i = 0; i < (matrix.length); i++) {
            for (int j = 0; j < (matrix[0].length); j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }


    public static boolean isWin(String[][] matrix) {
        int counter = 0;
        for(int i = 1; i < (matrix.length-1); i++) {
            for (int j = 1; j < (matrix[0].length - 1); j++) {
                if (matrix[i][j] == " -  ") {
                    counter++;
                }
            }
        }
        if(counter==0) {
            System.out.println("Oyunu kazandınız!");
            return true;
        }
        else return false;
    }
}