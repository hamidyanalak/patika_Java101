/*Dik Üçgende Hipotenüs Bulan Program
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
*/
import java.util.Scanner;
public class FindHypoTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //değişkenlerin tanımlanması/defining variables
        double x, y, z;
        double a, b, c, u, area;

        //kullanıcıdan verilerin alınması/taking data from the user
        System.out.println("Lütfen üçgenin dik kenar uzunluklarını yazınız: ");
        x = input.nextDouble();
        y = input.nextDouble();

        //hipotenüs hesaplanması/calculating the hypotenuse
        z = Math.sqrt(x * x + y * y);

        //değerin ekrana yazdırılması/print the value
        System.out.println("Dik kenarlarını girmiş olduğunuz üçgenin hipotenüs değeri : " + z);

        //--------------------

        //kullanıcıdan verilerin alınması/taking data from the user
        System.out.println("Alan hesabının yapılabilmesi için lütfen üçgenin kenar uzunlarını yazınız: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        //alan hesaplanması/calculating the area
        u = (a+b+c)/2;
        area = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        //değerlerin ekrana yazdırılması/print the values
        System.out.println("Girmiş olduğunuz değerler : " + a + " " + b + " " + c);
        System.out.println("Girmiş olduğunuz değerlere ait üçgenin alanı : " + area);

    }
}
