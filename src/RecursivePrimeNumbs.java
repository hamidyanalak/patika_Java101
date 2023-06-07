/*
Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
*/
import java.util.Scanner;
public class RecursivePrimeNumbs {
        public static boolean isPrime(int number, int divider){
            if (number < 2) { // İkiden küçük sayılar asal değil.
                return false;
            }
            if (number == 2){ // 2 asal bir sayıdır.
                return true;
            }
            if (number % divider == 0) { //Eğer sayı bölündüyse asal değildir.
                return false;
            }
            if (divider * divider > number){ // Sayının karekökünden büyük sayılara bölünmezse asaldır.
                return true;
            }
            return isPrime(number, divider +1); //Böleni arttırarak fonksiyonu tekrar çağırır.
        }
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.print("Lütfen bir sayı giriniz : ");
            int number = input.nextInt();

            if(isPrime(number,2)){
                System.out.println(number + " asal bir sayıdır.");
            }
            else {
                System.out.println(number + " asal bir sayı değildir.");
            }


        }
    }