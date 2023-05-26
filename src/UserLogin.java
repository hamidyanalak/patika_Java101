/*
Ödev
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
eğer kullanıcı sıfırlamak isterse
yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
*/
import java.sql.SQLOutput;
import java.util.Scanner;
public class UserLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //değişkenlerin tanımlanması/defining variables
        String username="pardus", password, truePassword="12345678", reset, newPassword, message;

        //kullanıcıdan verilerin alınması/taking datas from the user
        System.out.print("Lütfen kullanıcı adınızı giriniz : ");
        username = input.nextLine();
        System.out.print("Lütfen  parolanızı giriniz : ");
        password = input.nextLine();

        //bilgilerin karşılaştırılması ve ekrana yazdırılması/comparing information and printing values
        if (username.equals("pardus") && truePassword.equals(password)) System.out.println("Giriş Başarılı! ");
        else {
            System.out.println("Bilgileriniz hatalı! \nŞifrenizi sıfırlamak ister misiniz? :  (Evet/Hayır) ");
            reset = input.nextLine();
            if( reset.equals("Evet") || reset.equals("evet") || reset.equals("EVET")) {
                System.out.println("Lütfen yeni bir şifre oluşturunuz.");
                newPassword = input.nextLine();
                message = (newPassword.equals(truePassword)) || (newPassword.equals(password)) ? "Şifre Oluşturulamadı, lütfen başka şifre giriniz" : "Şifre oluşturuldu";
                System.out.println(message);
            }
        }



    }
}
