/*
Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360
*/
import java.util.Scanner;
public class CalcValOfCirc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //değişkenlerin tanımlanması/defining variables
        double r, area, perimeter, pi=3.14, angle, pieArea;

        //kullanıcıdan veri alınması/taking data from the user
        System.out.print("Lütfen dairenin yarıçapını giriniz : ");
        r = input.nextDouble();

        //alan ve çevrenin hesaplanması/calculating area and perimeter
        area = pi * r * r;
        perimeter = 2 * pi * r;

        //değerlerin yazdırılması/printing values
        System.out.println("Yarıçap : " + r);
        System.out.println("Dairenin çevresi : " + perimeter);
        System.out.println("Dairenin alanı : " + area);


        //kullanıcıdan veri alınması/taking data from the user
        System.out.print("Lütfen daire diliminin alanını bulmak istediğiniz üçgenin yarıçapını giriniz : ");
        r = input.nextDouble();
        System.out.print("Lütfen hesaplanmasını istediğiniz daire diliminin merkez açısını giriniz : ");
        angle = input.nextDouble();

        //dilimin alan hesabı/calculating area of pie
        pieArea = (pi * r * r * angle)/360;

        //değerlerin yazdırılması/printing values
        System.out.println("Yarıçap : " + r);
        System.out.println("Merkez açı : " + angle);
        System.out.println("Dilimin alanı : " + pieArea);

    }
}
