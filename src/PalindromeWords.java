import java.util.Scanner;
public class PalindromeWords {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz: ");
        String word = input.nextLine();

        if(isPalindrome(word)) {
            System.out.println(word + " kelimesi palindrom bir kelimedir.");
        }
        else {
            System.out.println(word + " kelimesi palindrom bir kelime değildir.");

        }
    }
}