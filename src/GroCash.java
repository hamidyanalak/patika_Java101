/*
Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
Örnek Çıktı;

Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL
*/
import java.util.Scanner;
public class GroCash {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        //değişkenlerin tanımlanması/defining variables
        int pear, apple, tomato, banana, eggplant;
        double amount;

        //kullanıcıdan verilerin alınması/taking datas from the user
        System.out.print("Kaç kg armut aldınız? : ");
        pear = input.nextInt();
        System.out.print("Kaç kg elma aldınız? : ");
        apple = input.nextInt();
        System.out.print("Kaç kg domates aldınız? : ");
        tomato = input.nextInt();
        System.out.print("Kaç kg muz aldınız? : ");
        banana = input.nextInt();
        System.out.print("Kaç kg patlıcan aldınız? : ");
        eggplant = input.nextInt();

        //tutarın hesaplanması/calculating the amount
        amount = pear*2.14 + apple*3.67 + tomato*1.11 + banana*0.95 + eggplant*5;

        //değerlerin yazdırılması/printing values
        System.out.println("Toplam tutar : " + String.format("%.2f",amount) + " TL");
    }
}
