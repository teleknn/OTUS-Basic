import java.util.Scanner;

public class HomeWorkJVSintakLoopMethod {
    public static void main(String[] args) {

        //ЗАДАЮ 3 МАССИВА С ВОПРОСОМ И 2-4 ОТВЕТАМИ

        int[] result = new int[3];

        String[] question1 = {"К какому виду операционных систем относиться Linux?",
                "1 - Монолитное ядро",
                "2 - Микро ядро",
                "3 - Гибридное ядро"};
        printArray(question1);
        result[0] = answer(1, 3); //ПРАВИЛЬНЫЙ ОТВЕТ и КОЛИЧЕСТВО ВОПРОСОВ ПЕРЕДАЮ В МЕТОД
        System.out.println();

        String[] question2 = {"Во что компилируется файл с исходым кодом класса в Java?",
                "1 - В файл *.jar",
                "2 - В файл *.class",
                "3 - В файл *.exe",
                "4 - В файл *.mp4"};
        printArray(question2);
        result[1] = answer(2, 4);
        System.out.println();

        String[] question3 = {"Что такое компиляция?",
                "1 - Исполнение программы \"на лету\"",
                "2 - Полное преобразование кода программы в машинный язык",
                "3 - Компьютерная инсталляция"};
        printArray(question3);
        result[2] = answer(2, 3);
        System.out.println();


        //ПОДСЧЕТ И ПЕЧАТЬ РЕЗУЛЬТАТОВ

        System.out.println("Ваши результаты:");
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 1) {
                System.out.println((i + 1) + " вопрос ответ - ВЕРНО");
            } else {
                System.out.println((i + 1) + " вопрос ответ - НЕ ВЕРНО");
            }
        }

    }

    // 1 МЕТОД ВЫВОДИТ МАССИВ НА ЭКРАН

    public static void printArray(String[] list) {
        for (String s : list) {
            System.out.println(s);
        }
    }

    // 2 МЕТОД ДЛЯ ОБРАБАТЫВАЕТ ВВОД ДАННЫХ С КЛАВИАТУРЫ

    public static int answer(int correctAnswer, int maxAnswer) {
        System.out.println("Введите Ваш ответ и нажминете Enter:");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = 0;

        for (int k = 0; k < 100000; k++) {
            if (x == correctAnswer) {
                y = 1;
                break;
            } else if (x <= maxAnswer) {
                y = 2;
                break;
            } else {
                System.out.println("Вы ввели не верное число, повторите ввод");
                x = s.nextInt();
            }
        }
        return y;
    }
}




