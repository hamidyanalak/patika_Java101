/*
Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart
Ödev
Aynı örneği switch-case kullanmadan yapınız.
*/
import java.util.Scanner;
public class HorosFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //değişkenlerin tanımlanması/defining variables
        int month, day;
        String horos = "";
        boolean isError = false;

        //kullanıcıdan verilerin alınması/taking datas from the user
        System.out.print("Lütfen kaçıncı ayda doğduğunuzu giriniz : ");
        month = input.nextInt();
        System.out.print("Lütfen ayın kaçıncı günü doğduğunuzu giriniz : ");
        day = input.nextInt();

        //bilgilerin karşılaştırılması/comparing values
        if (month == 1) {
            if(day >=1 && day <=31) horos = day < 22 ? "Oğlak" : "Kova";
            else isError = true;
        }
        else if (month == 2) {
            if(day >=1 && day <=29) horos = day < 20 ? "Kova" : "Balık";
            else isError = true;
        }
        else if (month == 3) {
            if(day >=1 && day <=31) horos = day < 21 ? "Balık" : "Koç";
            else isError = true;
        }
        else if (month == 4) {
            if(day >=1 && day <=30) horos = day < 21 ? "Koç" : "Boğa";
            else isError = true;
        }
        else if (month == 5) {
            if(day >=1 && day <=31) horos = day < 22 ? "Boğa" : "İkizler";
            else isError = true;
        }
        else if (month == 6) {
            if(day >=1 && day <=30) horos = day < 23 ? "İkizler" : "Yengeç";
            else isError = true;
        }
        else if (month == 7) {
            if(day >=1 && day <=31) horos = day < 23 ? "Yengeç" : "Aslan";
            else isError = true;
        }
        else if (month == 8) {
            if(day >=1 && day <=31) horos = day < 23 ? "Aslan" : "Başak";
            else isError = true;
        }
        else if (month == 9) {
            if(day >=1 && day <=30) horos = day < 23 ? "Başak" : "Terazi";
            else isError = true;
        }
        else if (month == 10) {
            if(day >=1 && day <=31) horos = day < 23 ? "Terazi" : "Akrep";
            else isError = true;
        }
        else if (month == 11) {
            if(day >=1 && day <=30) horos = day < 22 ? "Akrep" : "Yay";
            else isError = true;
        }
        else if (month == 12) {
            if(day >=1 && day <=31) horos = day < 22 ? "Yay" : "Oğlak";
            else isError = true;
        }
        else isError = true;

        //değerlerin ekrana yazdırılması/printing values
        System.out.println("Doğum tarihiniz : " + day + "." + month);
        if(isError) System.out.println("Lütfen geçerli bir tarih giriniz. ");
        else System.out.print("Burcunuz : " + horos);

        }
    }
