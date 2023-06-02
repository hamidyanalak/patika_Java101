/*
Java döngüler ile fibonacci serisi bulan program yazıyoruz.
Fibonacci serisinin eleman sayısını kullanıcıdan alın.
*/
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //değişkenlerin tanımlanması
        long first=0, second=1, sum, counter=0, i;

        //kullanıcıdan eleman sayısının alınması
        System.out.print("Lütfen Fibonacci serisinden kaç eleman yazdırmak istediğinizi giriniz : ");
        counter = input.nextInt();

        //ilk iki elemanın yazdırılması
        System.out.print(first + " " + second + " ");

        //döngü ile devam eden elemanların hesaplanması ve yazdırılması
        for(i=2; i<counter; i++) {
            sum = first + second;
            System.out.print(sum + " ");
            first = second;
            second = sum;
        }
    }
}