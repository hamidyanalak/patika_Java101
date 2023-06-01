/*
Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
*/
import java.util.Scanner;
public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //değişkenlerin tanımlanması/defining variables
        double i, j, k, number;

        //kullanıcıdan veri alınması/taking data from the user
        System.out.print("Lütfen bir sayı giriniz : ");
        number = input.nextInt();

        //değerlerin hesaplanması ve yazdırılması/calculating and printing values

        //Ters Üçgen Çizimi

        for(i=0; i<number; i++){
            for(j=0; j<=i; j++){
                System.out.print(" ");
            }
            for(j=0; j<number-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}