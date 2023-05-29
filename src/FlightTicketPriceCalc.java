/*
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
Mesafe başına ücret 0,10 TL / km olarak alın.
İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasındaki koşullara göre müşteriye aşağıdaki indirimleri uygulayın.

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
İpucu
Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
Toplam Tutar = (135-27)* 2 = 216 TL
Senaryolar
Senaryo 1
Mesafeyi km türünden giriniz : 1500
Yaşınızı giriniz : 20
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 2

Toplam Tutar = 216 TL
Senaryo 2
Mesafeyi km türünden giriniz : -500
Yaşınızı giriniz : 1
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 77

Hatalı Veri Girdiniz !
Senaryo 3
Mesafeyi km türünden giriniz : 200
Yaşınızı giriniz : 35
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 1

Toplam Tutar = 20.0 TL
*/
import java.util.Scanner;
public class FlightTicketPriceCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //değişkenlerin tanımlanması/defining variables
        int distance, age, tripType;
        double pricePerKm = 0.1, price, ageDiscount, ageDiscountRate= 0.0, discountedAmount = 0.0, roundTripDiscount, roundTripDiscountRate = 0.0;
        boolean isError = false;

        //kullanıcıdan verilerin alınması/taking datas from the user
        System.out.print("Lütfen mesafeyi km cinsinden giriniz : ");
        distance = input.nextInt();
        System.out.print("Lütfen yaşınızı giriniz : ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz(1 => Tek Yön, 2 => Gidiş Dönüş): ");
        tripType = input.nextInt();

        //bilgilerin karşılaştırılması/comparing values
        if (distance > 0 && age > 0 && (tripType == 1 || tripType == 2)) {
            price = distance * pricePerKm;
            if(age<12) ageDiscountRate = 0.5;
            else if(age<=24) ageDiscountRate = 0.1;
            else if(age>65) ageDiscountRate = 0.3;
            ageDiscount = price * ageDiscountRate;
            discountedAmount = price - ageDiscount;
            if(tripType == 2) {
                roundTripDiscountRate = 0.2;
                roundTripDiscount = discountedAmount * roundTripDiscountRate;
                discountedAmount = (discountedAmount - roundTripDiscount) * 2;
            }
        }
        else  isError = true;

        //değerlerin ekrana yazdırılması/printing values
        System.out.println("Mesafe : " + distance + ", Yaş : " + age + ", Yolculuk tipi : " +tripType);
        if(isError) System.out.println("Lütfen geçerli değerler giriniz. ");
        else System.out.print("Bilet fiyatı : " + discountedAmount + " TL");
    }
}
