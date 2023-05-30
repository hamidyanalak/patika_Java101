/*
Ödev ATM Projesi
Projedeki ATM işlemlerini "Switch-Case" kullanarak yapınız.
*/
import java.util.Scanner;
public class ATMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //değişkenlerin tanımlanması/defining variables
        String userName, password;            //çekmek , yatırmak
        int right = 3, balance=15000, process, withdraw, deposit;

        //hesap dondurulmamışsa, kalan parola deneme hakkımız varsa
        while(right>0) {
            System.out.print("Lütfen kullanıcı adınızı giriniz : ");
            userName = input.nextLine();
            System.out.print("Lütfen parolanızı giriniz : ");
            password = input.nextLine();


            //kullanıcı adı ve parola kontrolü
            if(userName.equals("patika") && password.equals("Dev123")) {
                System.out.println("Giriş başarılı! Hoşgeldiniz.");
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    System.out.println(" 1- Para Çekme \n 2- Para Yatırma \n 3- Bakiye Sorgulama \n 4- Çıkış Yap" );
                    process = input.nextInt();
                    //işlem sorgusu
                    switch (process) {
                        case 1:
                            System.out.print("Çekmek istediğiniz tutarı giriniz : ");
                            withdraw = input.nextInt();
                            if (withdraw > balance) System.out.println("Yetersiz bakiye!");
                            else balance-=withdraw;
                            System.out.println("Yeni bakiyeniz: " + balance + " TL");
                            break;
                        case 2:
                            System.out.print("Yatırmak istediğiniz tutarı giriniz : ");
                            deposit = input.nextInt();
                            balance+=deposit;
                            System.out.println("Yeni bakiyeniz: " + balance + " TL");
                            break;

                        case 3:
                            System.out.println("Bakiyeniz: " + balance + " TL");
                            break;

                        default:
                            if(process!=4) System.out.println("Lütfen geçerli bir işlem seçiniz!");
                            break;
                    }
                } while (process!=4);
                System.out.println("Hoşça kalın!");
                break;
            }
            //giriş başarısız ise
            else {
                right--;
                System.out.println("Giriş başarısız! Lütfen bilgilerinizi kontrol ediniz.");
                if(right==0) {
                    System.out.println("Hesabınız dondurulmuştur! Banka ile iletişime geçiniz.");
                }
                else System.out.println("Kalan hakkınız: " + right);
            }
        }
    }
}