/*
Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

Çin Zodyağı nedir?

4000 bin yıldır kullanılan bir astroloji çeşididir.
Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar.
Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve
yıldızlarla pek bir ilgisi yoktur.

Çin Zodyağı nasıl hesaplanır?

Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

Doğum Tarihi %12 = 0 ➜ Maymun
Doğum Tarihi %12 = 1 ➜ Horoz
Doğum Tarihi %12 = 2 ➜ Köpek
Doğum Tarihi %12 = 3 ➜ Domuz
Doğum Tarihi %12 = 4 ➜ Fare
Doğum Tarihi %12 = 5 ➜ Öküz
Doğum Tarihi %12 = 6 ➜ Kaplan
Doğum Tarihi %12 = 7 ➜ Tavşan
Doğum Tarihi %12 = 8 ➜ Ejderha
Doğum Tarihi %12 = 9 ➜ Yılan
Doğum Tarihi %12 = 10 ➜ At
Doğum Tarihi %12 = 11 ➜ Koyun

Senaryo:

Doğum Yılınızı Giriniz : 1990
Çin Zodyağı Burcunuz : At

*/
import java.util.Scanner;
public class ChineseZodiacCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //değişkenlerin tanımlanması/defining variables
        int year, remain;
        String zodiac = "";

        //kullanıcıdan verilerin alınması/taking datas from the user
        System.out.print("Lütfen doğum yılınızı giriniz : ");
        year = input.nextInt();

        //bilgilerin karşılaştırılması/comparing values
        remain = year%12;
        switch (remain) {
            case 0:
                zodiac = "Maymun";
                break;
            case 1:
                zodiac ="Horoz";
                break;
            case 2:
                zodiac = "Köpek";
                break;
            case 3:
                zodiac = "Domuz";
                break;
            case 4:
                zodiac = "Fare";
                break;
            case 5:
                zodiac = "Öküz";
                break;
            case 6:
                zodiac = "Kaplan";
                break;
            case 7:
                zodiac = "Tavşan";
                break;
            case 8:
                zodiac = "Ejderha";
                break;
            case 9:
                zodiac = "Yılan";
                break;
            case 10:
                zodiac = "At";
                break;
            case 11:
                zodiac = "Koyun";
                break;
        }

        //değerlerin ekrana yazdırılması/printing values
        System.out.println("Doğum yılınız : " + year);
        System.out.println("Çin Zodyağı burcunuz : " + zodiac);
    }
}
