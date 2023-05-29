/*
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
*/
import java.util.Scanner;
public class FindPowOf20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //değişkenlerin tanımlanması/defining variables
        int i,border;

        //kullanıcıdan verinin alınması ve karşılaştırılması/taking data from the user and comparing
        System.out.print("Lütfen sınır değerini belirleyiniz : ");
        border = input.nextInt();
        for(i=1; i<border; i*=20) System.out.println(i); //değerin yazdırılması/printing value
    }
}

