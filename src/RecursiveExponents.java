/*
Java dilinde, taban ve üs değerleri kullanıcıdan alınan
üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.
*/
import java.util.Scanner;
public class RecursiveExponents {
    static int recExpo(int base, int exponents) { //Özyinelemeli üs hesabı yapan metot
        int result = 1;
        if(exponents == 0) return 1;
        result = base * recExpo(base, exponents-1);
        return result;
        }
    public static void main(String[] args) {
        //kullanıcıdan değerlerin alınması
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen hesaplanacak üslü sayının tabanını giriniz : ");
        int base = input.nextInt();
        System.out.print("Lütfen hesaplanacak üslü sayının üssünü giriniz : ");
        int exponents = input.nextInt();

        if(base == 0 && exponents == 0) System.out.println("Sonuç : Tanımsız");
        else System.out.println("Sonuç : " + recExpo(base, exponents));
    }
}




