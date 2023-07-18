import java.util.Scanner;
import java.util.Arrays;
public class NearestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputNumber;
        int[] list = {15,12,788,1,-1,-778,2,0};
        System.out.print("Kıyaslama için lütfen bir sayı giriniz: ");
        inputNumber = input.nextInt();

        int [] newList = Arrays.copyOf(list, list.length+1);
        newList[newList.length-1] = inputNumber;
        Arrays.sort(newList);
        int index =Arrays.binarySearch(newList, inputNumber);

        System.out.println("Dizi: " + Arrays.toString(list));
        System.out.println("Girilen Sayı : " + inputNumber);
        System.out.println("Girilen sayıdan küçük en yakın sayı :" + newList[index-1]);
        System.out.println("Girilen sayıdan büyük en yakın sayı :" + newList[index+1]);
    }
}
