import java.util.Scanner;
public class ToftheMatrix {
    public static void main(String[] args) {
        //matris oluşturma kodu
        int[][] m= createMatrix();

        System.out.println("The matrix is: ");

        display(m); //matrisi ekrana yazdıran program
        System.out.println("The transpose is: ");
        display(transpose(m));
    }
    public static void display(int[][] matrix) { //ekrana yazdıran fonksiyon
        for(int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int[][] matrix) {
        int[][] matrixT = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixT[j][i] = matrix[i][j];
            }
        }
        return matrixT;
    }
    public static int[][] createMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen matrisin satır sayısını giriniz: ");
        int row = input.nextInt();
        System.out.print("Lütfen matrisin sütun sayısını giriniz: ");
        int col = input.nextInt();

        int[][] newMatrix = new int[row][col];
        System.out.println("Matris elemanlarını sırasıyla giriniz.");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int a = input.nextInt();
                System.out.print(i +". satır " + j +". sütun elamanı: " + a + "   ");
               newMatrix[i][j] = a;
            }
        }
        System.out.println();
        return newMatrix;
    }

}