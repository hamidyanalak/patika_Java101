/*
Java ile girilen sayının harmonik serisini bulan program yazacağız.
*/
import java.util.Scanner;
public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //değişkenlerin tanımlanması/defining variables
        int number;
        double i, sum=0;

        //kullanıcıdan veri alınması/taking data from the user
        System.out.print("Lütfen bir sayı giriniz : ");
        number = input.nextInt();

        //değerin hesaplanması ve yazdırılması/calculating and printing value
        for(i=1; i<=number; i++) {
            sum+=(1/i);
        }
        System.out.print("Harmonik seri toplamı = " + sum);
    }
}