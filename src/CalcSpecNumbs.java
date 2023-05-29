/*
Work 1: Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve
girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
Ödev
Work 2: Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
*/
import java.util.Scanner;
public class CalcSpecNumbs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //değişkenlerin tanımlanması/defining variables
        int i, number=0, sum=0;

        /* Work 1

        while(number>=0) {
            System.out.print("Lütfen bir sayı giriniz : ");
            number = input.nextInt();
            if(number%2 == 1) sum+=number;
        }
        System.out.println("Tekler toplamı : " + sum);
        */

        //Work 2
        //bilgilerin karşılaştırılması/comparing values
        while(number%2 == 0) {
            //kullanıcıdan verilerin alınması/taking datas from the user
            System.out.print("Lütfen bir sayı giriniz : ");
            number = input.nextInt();
            if(number%4 == 0) sum+=number;
        }
        //değerin yazdırılması/printing value
        System.out.println("Dördün katlarının toplamı : " + sum);
    }
}
