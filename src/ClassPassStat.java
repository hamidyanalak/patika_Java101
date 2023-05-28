/*
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
*/
import java.util.Scanner;

public class ClassPassStat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //değişkenlerin tanımlanması/defining variables
        int numLesson=0;
        double mat, phy, tur, che, mus, sum=0, avg;

        //kullanıcıdan verilerin alınması/taking datas from the user
        System.out.print("Lütfen matematik notunuzu giriniz : ");
        mat = input.nextDouble();
        System.out.print("Lütfen fizik notunuzu giriniz : ");
        phy = input.nextDouble();
        System.out.print("Lütfen Türkçe notunuzu giriniz : ");
        tur = input.nextDouble();
        System.out.print("Lütfen kimya notunuzu giriniz : ");
        che = input.nextDouble();
        System.out.print("Lütfen müzik notunuzu giriniz : ");
        mus = input.nextDouble();


        //bilgilerin karşılaştırılması ve ekrana yazdırılması/comparing information and printing values
        if (mat >= 0 && mat <= 100) { sum += mat; numLesson++; }
        if (phy >= 0 && phy <= 100) { sum += phy; numLesson++; }
        if (tur >= 0 && tur <= 100) { sum += tur; numLesson++; }
        if (che >= 0 && che <= 100) { sum += che; numLesson++; }
        if (mus >= 0 && mus <= 100) { sum += mus; numLesson++; }

        avg = sum/numLesson;

        System.out.println("Geçerli notlar girdiğiniz " +  numLesson + " dersinizin ortalaması : " + avg);
        System.out.println(avg >= 55 ? "Sınıfı geçtiniz!":"Maalesef sınıfı geçemediniz." );
    }
}
