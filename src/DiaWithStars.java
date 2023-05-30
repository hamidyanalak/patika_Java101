/*
Ödev
Java'da döngüler kullanarak yıldızlar ile elmas yapınız.
*/
import java.util.Scanner;
public class DiaWithStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //değişkenlerin tanımlanması/defining variables
        double i, j, k, number;

        //kullanıcıdan veri alınması/taking data from the user
        System.out.print("Lütfen bir sayı giriniz : ");
        number = input.nextInt();

        //değerlerin hesaplanması ve yazdırılması/calculating and printing values

        //Elmasın Üst Kısmı
        for(i=0; i<number; i++) {
            for(j=1; j<=(number-i-1); j++) {
                System.out.print(" ");
        }
            for(j=0; j<=i;j++){
                System.out.print("* ");
            }
        System.out.println();
    }
        //Elmasın Alt Kısmı
        for(i=0; i<number-1; i++){
            for(j=0; j<=i; j++){
                System.out.print(" ");
            }
            for(j=0; j<number-i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
  }
}