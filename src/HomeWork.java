import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// Установить JDK и среду разработки
// Открыть данный класс в IDE
// Скомпилировать данный класс с помощью команды javac.
// Запустить программу на выполнение с помощью команды java
// Запустить программу на выполнение с помощью среды разработки
// Когда программа запросит - введите свое имя латиницей
// Отправить в чат задания скриншоты обоих запусков и строку результата работы программы

public class HomeWork {

    public static void main(String[] args) throws IOException {
        //String fullName = getName();
        int age = 2;
        //String encodedFullName = Base64.getEncoder().encodeToString(fullName.getBytes());
        //System.out.println("Program result: " + encodedFullName);
        System.out.println(age);
    }

    public static String getName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter you full name");
        return sc.nextLine();
    }

    public static int getAge() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter you age: ");
        return reader.read();
    }
}





