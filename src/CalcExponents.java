/*
Ödev
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
*/
import java.util.Scanner;
public class CalcExponents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //değişkenlerin tanımlanması/defining variables
        int i, base, exponents;
        long result=1;

        //kullanıcıdan verilerin alınması ve karşılaştırılması/taking datas from the user and comparing
        System.out.print("Lütfen hesaplanacak üslü sayının tabanını giriniz : ");
        base = input.nextInt();
        System.out.print("Lütfen hesaplanacak üslü sayının üssünü giriniz : ");
        exponents = input.nextInt();

        for(i=1; i<=exponents; i++) {
            result*=base;
        }
        //değerin yazdırılması/printing value
        System.out.println("Girdiğiniz değerler -> taban = " + base +"," + " üs = " + exponents);
        System.out.println("Sonuç = " + result);
    }
}




