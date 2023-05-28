/*
Ödev
Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
*/
import java.util.Scanner;
public class NumberSorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //değişkenlerin tanımlanması/defining variables
        int num1, num2, num3, min, mid, max;

        //kullanıcıdan verilerin alınması/taking datas from the user
        System.out.print("Lütfen sıralanmasını istediğiniz birbirinden farklı üç sayı giriniz : ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        //bilgilerin karşılaştırılması/comparing information
        if (num1 < num2 && num1 < num3) {
            min = num1;
            if (num2 < num3) {
                mid = num2;
                max = num3;
            }
            else {
                mid = num3;
                max = num2;
            }
        }
        else if (num2 < num1 && num2 <num3) {
            min = num2;
            if(num1 < num3) {
                mid = num1;
                max = num3;
            }
            else {
                mid = num3;
                max = num1;
            }
        }
        else {
            min = num3;
            if(num1 < num2) {
                mid = num1;
                max = num2;
            }
            else {
                mid = num2;
                max = num1;
            }
        }

        //bilgilerin ekrana yazdırılması/printing values
        System.out.println("Girdiğiniz sayılar : " + num1 + " " + num2 + " " + num3);
        System.out.println("Küçükten büyüğe doğru : " + min + " " + mid + " " + max);
        System.out.print("Büyükten küçüğe doğru : " + max + " " + mid + " " + min);
    }
}
