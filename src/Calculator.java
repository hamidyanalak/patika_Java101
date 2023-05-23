/*
Ödev
https://academy.patika.dev/courses/java101/pratik-hesap-mak-1
Videodaki hesap makinesini switch-case kullanarak yapınız.
*/
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //değişkenlerin tanımlanması/defining variables
        int a, b, operation;

        //kullanıcıdan verilerin alınması/taking datas from the user
        System.out.print("Lütfen bir sayı giriniz : ");
        a = input.nextInt();
        System.out.print("Lütfen diğer sayıyı giriniz : ");
        b = input.nextInt();
        System.out.print("Lütfen toplama için 1, çıkarma için 2, çarpma için 3, bölme için 4 giriniz. ");
        operation = input.nextInt();

        //değerlerin yazdırılması/printing values
        switch (operation) {
            case 1:
                System.out.println(a + " + " + b + " = " + (a+b));
                break;
            case 2:
                System.out.println(a + " - " + b + " = " + (a-b));
                break;
            case 3:
                System.out.println(a + " * " + b + " = " + (a*b));
                break;
            case 4:
                switch (b) {
                    case 0:
                        System.out.println("Sıfıra bölme işlemi yapılamaz! ");
                        break;
                    default:
                        System.out.println(a + " / " + b + " = " + (a / b));
                }
                break;
            default:
                System.out.println("Lütfen geçerli bir sayı giriniz.");
        }
    }
}
