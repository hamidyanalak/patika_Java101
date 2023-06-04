/*
Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.
Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
*/
import java.util.Scanner;
public class Palindrom {

    static boolean funcPalindrom(int number) {
        int temp = number, reverseNumb=0, lastDigit;
        while(temp!=0) {
            lastDigit = temp %10;
            reverseNumb = reverseNumb*10 + lastDigit;
            temp /= 10;
        }
        return number==reverseNumb ? true : false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //değişkenlerin tanımlanması/defining variables
        int number;
        System.out.print("Lütfen bir sayı giriniz : ");
        number = input.nextInt();

        if(funcPalindrom(number))
        System.out.print(number + " sayısı palindrom bir sayıdır.");
        else System.out.print(number + " sayısı palindrom bir sayı değildir.");
    }
}