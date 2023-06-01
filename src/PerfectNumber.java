/*
Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve
sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.”
ifadelerini ekrana yazan programı Java dilinde yazınız.

Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı
 kendisine eşit olan sayıya mükemmel sayı denir.

Senaryolar
Bir sayı giriniz: 28
28 Mükemmel sayıdır
Bir sayı giriniz: 1
1 Mükemmel sayı değildir.
Bir sayı giriniz: 496
496 Mükemmel sayıdır
*/
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //değişkenlerin tanımlanması
        int i, number, sum=0;

        //Kullanıcıdan sayının alınması
        System.out.print("Lütfen bir sayı giriniz : ");
        number = input.nextInt();

        for(i=1; i<number; i++) {
            if(number%i == 0) {
                sum+=i;
            }
        }
        System.out.println(number==sum ? number +" sayısı mükemmel sayıdır." : number + " sayısı mükemmel sayı değildir.");
    }

}
