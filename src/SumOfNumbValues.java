/*
Ödev
Bir sayının sayı değerlerinin toplamını hesaplayan program yazınız.

Örnek : 1643 = 1 + 6 + 4 + 3 = 14
*/
import java.util.Scanner;
public class SumOfNumbValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //değişkenlerin tanımlanması/defining variables
        int sum=0, number;

        //kullanıcıdan veri alınması/taking data from the user
        System.out.print("Lütfen bir sayı giriniz : ");
        number = input.nextInt();

        //değerin hesaplanması ve yazdırılması/calculating and printing value
        System.out.print(number);
        while(number !=0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.print(" sayısının, sayı değerleri toplamı = " + sum);
    }
}