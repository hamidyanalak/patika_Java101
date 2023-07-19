import java.util.Arrays;
public class CountRepeatTime {
    public static void main(String[] args) {
        int[] list = {3,7,3,3,2,2,9,10,10,21,1,33,9,1};
        int count = 1;
        System.out.println("Dizi : " + Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("Sıralı : " + Arrays.toString(list));
        System.out.println("Tekrar Edenler ");

        for (int i = 0; i<list.length; i++) {
            if (i == 0) {
                for (int j=0; j<list.length; j++) {
                    if ((i!=j) && (list[i] == list[j])) {
                        count++;
                    }
                }
                System.out.println(list[i] + " sayısı " + count + " kez tekrar edildi.");
            }
            else if (list[i] != list[i-1]) {
                for (int j=0; j<list.length; j++) {
                    if ((i!=j) && (list[i] == list[j])) {
                        count++;
                    }
                }
                System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
            }
            count = 1;
        }
    }
}