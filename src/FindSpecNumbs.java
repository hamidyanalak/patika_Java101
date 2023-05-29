/*
Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.
Ödev
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
*/
import java.util.Scanner;
public class FindSpecNumbs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //değişkenlerin tanımlanması/defining variables
        int i, number, counter=0, sum=0, avg=0;

        //kullanıcıdan verilerin alınması/taking datas from the user
        System.out.print("Lütfen bir sayı giriniz : ");
        number = input.nextInt();

        //bilgilerin karşılaştırılması ve değerlerin yazdırılması/comparing and printing values
        for(i=1; i<number; i++) {
            if(i%2 == 0) {
                System.out.println("i : " + i);
            }
            if(i%12 == 0) {
                sum+=i;
                counter++;
            }
        }
        avg = sum/counter;
        System.out.println("Girilen sayıya kadar (3 ve 4'e bölünebilen) 12 ile bölünebilen sayıların ortalaması : " + avg);
    }
}
