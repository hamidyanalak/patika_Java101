/*
Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
Ödev
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
*/
import java.util.Scanner;
public class SuggestEvents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //değişkenlerin tanımlanması/defining variables
        int temp;

        //kullanıcıdan verilerin alınması/taking datas from the user
        System.out.print("Etkinlik önerisi için lütfen hava sıcaklığını giriniz : ");
        temp = input.nextInt();

        //bilgilerin karşılaştırılması ve ekrana yazdırılması/comparing information and printing values
        System.out.println("Girdiğiniz hava sıcaklığı : " + temp);
        System.out.print("Önerdiğimiz etkinlik : ");

        if(temp < 5) System.out.println("Kayak");
        else if (temp < 15) System.out.println("Sinema");
            else if(temp < 25) System.out.println("Piknik");
                else System.out.println("Yüzme");
    }
}
