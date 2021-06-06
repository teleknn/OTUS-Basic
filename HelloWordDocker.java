import java.util.Scanner;

public class HelloWordDocker {
    public static void main(String[] args) {
        System.out.println("Вам нравиться Docker?");
        System.out.println("1 - ДА");
        System.out.printf("2 - НЕТ" + "\n");
        System.out.println();
        String number;
        String one = "1";
        String two = "2";
        number = getNumber();

        boolean k = true;
        while (k = true){

            if (number.equals(one)) {
                System.out.println("МЫ ТАК И ЗНАЛИ!");
                break;
            }
            if (number.equals(two)) {
                System.out.println("НЕ ВЕРЮ повторите ввод");
                number = getNumber();
            } else {
                System.out.println("Вводите что то не то! ПОВТОРИТЕ 1 или 2");
                number = getNumber();
            }
        }
    }

    public static String getNumber() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
