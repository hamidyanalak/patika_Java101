/*
Ödev
Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
EKOK = (n1*n2) / EBOB
*/
import java.util.Scanner;
public class EbobEkokNumbs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //değişkenlerin tanımlanması
        int num1, num2, ebob=1, ekok, i, little;

        //Kullanıcıdan sayıların alınması
        System.out.print("Lütfen bir sayı giriniz : ");
        num1 = input.nextInt();
        System.out.print("Lütfen bir sayı daha giriniz : ");
        num2 = input.nextInt();
        System.out.println("Girdiğiniz sayılar: " + num1 + " " + num2);

        //girilen küçük sayının bulunması
        little = num1<num2 ? num1:num2;

        //döngü işlemi ile ebob bulunması
        i = little;
        while(i>=1) {
            i--;
            if(num1%i==0 && num2%i==0) {
                ebob = i;
                break;
            }
        }
        //ekok hesaplanması
        ekok = (num1 * num2)/ebob;

        //değerlerin yazdırılması
        System.out.println("EBOB = " + ebob + " EKOK = " +ekok);
    }
}