/**
 * @author Hamit YANALAK
 *
 */
import java.util.Scanner;

public class AvgOfNotes {
    public static void main(String[] args) {
        Scanner notes = new Scanner(System.in);

        // değişkenlerin tanımlanması/defining variables
        int mat, phy, che, turk, his, mus;

        System.out.println("Hazırsanız sırasıyla ders notlarınızı girmeye başlayabilirsiniz.");

        //kullanıcıdan notların alınması/taking notes from the user
        System.out.print("Matematik notu:");
        mat = notes.nextInt();

        System.out.print("Fizik notu:");
        phy = notes.nextInt();

        System.out.print("Kimya notu:");
        che = notes.nextInt();

        System.out.print("Türkçe notu:");
        turk = notes.nextInt();

        System.out.print("Tarih notu:");
        his = notes.nextInt();

        System.out.print("Müzik notu:");
        mus = notes.nextInt();

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
