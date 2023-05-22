/*
Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altındaki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
*/
import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //değişkenlerin tanımlanması/defining variables
        double distance, price, total;

        //kullanıcıdan veri alınması/taking data from the user
        System.out.print("Lütfen gidilen mesafeyi km cinsinden giriniz : ");
        distance = input.nextDouble();

        //tutarın hesaplanması/calculating the price and total
        price = distance*2.2;
        total = price<10 ? 20 : price+10;

        //değerin ekrana yazdırılması/printing the value
        System.out.println("Taksimetre Tutarı : " + total + " TL");

    }
}

