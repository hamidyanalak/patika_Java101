/*
Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak...
* */
import java.util.Scanner;

public class AvgOfGrades {
    public static void main(String[] args) {
        Scanner grades = new Scanner(System.in);

        // değişkenlerin tanımlanması/defining variables
        int mat, phy, che, turk, his, mus;

        System.out.println("Hazırsanız sırasıyla ders notlarınızı girmeye başlayabilirsiniz.");

        //kullanıcıdan notların alınması/taking notes from the user
        System.out.print("Matematik notu:");
        mat = grades.nextInt();

        System.out.print("Fizik notu:");
        phy = grades.nextInt();

        System.out.print("Kimya notu:");
        che = grades.nextInt();

        System.out.print("Türkçe notu:");
        turk = grades.nextInt();

        System.out.print("Tarih notu:");
        his = grades.nextInt();

        System.out.print("Müzik notu:");
        mus = grades.nextInt();

        //ortalamanın hesaplanması ve yazdırılması/calculating and printing the average
        double avg = (mat + phy + che + turk + his + mus)/6;
        System.out.println("Ortalamanız: "+ avg);

        //sınıfı geçme değerlendirmesi/pass assessment
        String pass = "Sınıfı geçtiniz!";
        String fail = "Maalesef sınıfta kaldınız";
        String s = avg > 60 ? pass : fail;
        System.out.println(s);
    }
}
