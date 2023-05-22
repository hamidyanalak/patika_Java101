/*
Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)

Çıktısı
Lütfen boyunuzu (metre cinsinden) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173
*/

import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //değişkenlerin tanımlanması/defining variables
        double height, weight, BMI;

        //kullanıcıdan verilerin alınması/taking datas from the user
        System.out.print("Lütfen boyunuzu metre cinsinden (örnek:1,65) giriniz : ");
        height = input.nextDouble();
        System.out.print("Lütfen kilonuzu kilogram cinsinden (örnek:50) giriniz : ");
        weight = input.nextDouble();

        //Vücut kitle indeksinin hesaplanması/Calculating BMI
        BMI = weight/(height*height);

        //değerlerin yazdırılması/printing values
        System.out.println("Boyunuz : " + height + "  Kilonuz: " + weight);
        System.out.println("Vücut kitle indeksiniz(BMI) : " + BMI);
    }
}
