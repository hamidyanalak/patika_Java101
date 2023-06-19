/*
Java'da recursive metotlar ile fibonacci serisi bulan program yapıyoruz.
Fibonacci serisi : 1 1 2 3 5 8 13 21 34
*/
import java.util.Scanner;
public class RecursiveFibo {
    static int funcRecurFibo(int number) {
      return (number == 1 || number == 2) ? 1 : funcRecurFibo(number-1) + funcRecurFibo(number-2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //değişken tanımlanması
         int number;

         //kullanıcıdan veri alınması
        System.out.print("Lütfen Fibonacci serisinin kaçıncı elemanını yazdırmak istediğinizi giriniz : ");
        number = input.nextInt();

        //değerin yazdırılması
        System.out.println(funcRecurFibo(number));

    }
}