/*
Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
Senaryo
Kaç tane sayı gireceksiniz: 4
1. Sayıyı giriniz: 16
2. Sayıyı giriniz: -22
3. Sayıyı giriniz: -15
4. Sayıyı giriniz: 100
En büyük sayı: 100
En küçük sayı: -22
*/
import java.util.Scanner;
public class MinMaxNumbs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //değişkenlerin tanımlanması
        int i, counter, number, min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;

        //Kullanıcıdan sayının alınması
        System.out.print("Lütfen kaç sayı gireceğinizi yazınız : ");
        counter = input.nextInt();

        for(i=1; i<=counter; i++) {
            System.out.print((i) +". sayıyı giriniz: ");
            number = input.nextInt();
            if(number<min) {
                min = number;
            }
            if(number>max) {
                max = number;
            }
        }
        System.out.println("Girdiğiniz en küçük sayı : " +min);
        System.out.print("Girdiğiniz en büyük sayı : " +max);
    }
}