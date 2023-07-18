/*
Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.
*/
import java.util.Arrays;
import java.util.Scanner;
public class ArrMinToMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen dizinin boyutunu giriniz: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Dizinin elemanlarını giriniz: ");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(i+1 + ". eleman: ");
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sıralama: " + Arrays.toString(arr));
    }
}
