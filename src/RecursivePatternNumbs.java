/*
Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan
döngü kullanmadan bir "Recursive" metot yazın.
Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
*/
import java.util.Scanner;
public class RecursivePatternNumbs {
    static void patternNumbs(int number) {
        if (number <= 0) {
            System.out.print(number + " ");
            return;
        } else {
            System.out.print(number + " ");
            number -= 5;
            patternNumbs(number); //özyineleme işlemi
            number += 5;
            System.out.print(number + " ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //kullanıcıdan veri alınması
        System.out.print("Lütfen bir sayı giriniz : ");
        int number = input.nextInt();
        //fonksiyon çağrısı
        patternNumbs(number);
    }
}
