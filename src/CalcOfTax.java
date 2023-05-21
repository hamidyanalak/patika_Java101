/**
 * @author Hamit YANALAK
 */
/*KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
*/
import java.util.Scanner;
public class CalcOfTax {
    public static void main(String[] args) {
        //değişkenlerin tanımlanması/defining variables
        double price, tax = 0;

        //kullanıcıdan fiyat tutarının alınması/get price amount from user
        Scanner amount = new Scanner(System.in);
        System.out.println("Lütfen vergisi hesaplanacak tutarı giriniz.");
        price = amount.nextDouble();

        //vergi oranının belirlenmesi/determination of tax rate
        tax = 1000 < price ? 1.08 : 1.18;

        //hesaplanan değerlerin ekrana yazdırılması/print the calculated values to the screen
        System.out.println("KDV'siz Fiyat = " + price);
        System.out.println("KDV Oranı = " + (price*tax-price)/price);
        System.out.println("KDV'li Fiyat = " + price*tax);
        System.out.println("KDV Tutarı = " + (price*tax-price));


    }

}
