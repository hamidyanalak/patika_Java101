/*
Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
*/
public class PrimeNumbers {
    public static void main(String[] args) {

        //değişkenlerin tanımlanması/defining variables
        int i, k, counter=0;

        //değerlerin hesaplanması ve yazdırılması/calculating and printing values
        for(i=2; i<=100; i++){
            counter=0;
            for(k=2; k<i; k++) {
                if(i%k==0) counter++;
            }
            if(counter==0)System.out.print(i + " ");
        }
    }
}