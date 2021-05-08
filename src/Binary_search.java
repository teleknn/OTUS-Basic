import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {

        int[] list = new int[100];
        int[] mesto = new int[100];


        for (int i = 0; i < list.length; i++) {
            Random x = new Random();
            list[i] = x.nextInt(100);
            mesto[i] = i;
        }

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(mesto));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для поиска:");
        int item = scanner.nextInt();

        //int item = 42;
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];
            if (guess == item) {
                System.out.println(mid);
            }
            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

    }
}
