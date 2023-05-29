/*
Ödev
N elemanlı bir kümenin elemanları ile oluşturulacak
r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
Java ile kombinasyon hesaplayan program yazınız.
Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
*/
import java.util.Scanner;
public class Combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //değişkenlerin tanımlanması/defining variables
        long i, j, k, n, r, nFact=1, rFact=1, minusFact=1, comb;

        //kullanıcıdan verilerin alınması ve karşılaştırılması/taking datas from the user and comparing
        System.out.println("Kombinasyon hesabı: C(n,r) = n! / (r! * (n-r)!)");
        System.out.print("Lütfen kombinasyon hesabı için n değerini  giriniz : ");
        n = input.nextInt();
        System.out.print("Lütfen kombinasyon hesabı için r değerini  giriniz : ");
        r = input.nextInt();

        for(i=1; i<=n; i++) {
            nFact*=i;
        }
        for(j=1; j<=r; j++) {
            rFact*=j;
        }
        for(k=1; k<=(n-r); k++) {
            minusFact*=k;
        }
        //C(n,r) = n! / (r! * (n-r)!)
        comb = nFact / (rFact * minusFact);

        //değerin yazdırılması/printing value
        System.out.println("Girdiğiniz değerler -> n= " + n +"," + " r= " + r);
        System.out.println("Kombinasyon / C(n,r) = " + comb);
    }
}



