import java.util.Scanner;

public class HomeWorkJVSintakLoop {
    public static void main(String[] args) {
        String[] question1 = new String[4];
        String[] question2 = new String[5];
        String[] question3 = new String[4];
        boolean result1 = true;
        boolean result2 = true;
        boolean result3 = true;

        //ПЕРВЫЙ ВОПРОС
        for (int i = 0; i < question1.length; i++) {
            if (i == 0) {
                question1[i] = "К какому виду операционных систем относиться Linux?";
                System.out.println(question1[i]);
            } else if (i == 1) {
                question1[i] = "1 - Монолитное ядро";
                System.out.println(question1[i]);
            } else if (i == 2) {
                question1[i] = "2 - Микро ядро";
                System.out.println(question1[i]);
            } else if (i == 3) {
                question1[i] = "3 - Гибридное ядро";
                System.out.println(question1[i]);

            } else {
                break;
            }
        }
        System.out.println("Введите Ваш ответ и нажминете Enter:");

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        for (int k = 0; k < 100000; k++) {
            if (x == 1) {
                //System.out.println("Ваш ответ верный");
                result1 = true;
                break;
            } else if (x == 2 || x == 3) {
                //System.out.println("Ваш ответ НЕ верный");
                result1 = false;
                break;
            } else {
                System.out.println("Вы ввели не верное число, повторите ввод");
                x = s.nextInt();
            }
        }
        System.out.println();

//ВТОРОЙ ВОПРОС
        for (int i = 0; i < question2.length; i++) {
            if (i == 0) {
                question2[i] = "Во что компилируется файл с исходым кодом класса в Java?";
                System.out.println(question2[i]);
            } else if (i == 1) {
                question2[i] = "1 - В файл *.jar";
                System.out.println(question2[i]);
            } else if (i == 2) {
                question2[i] = "2 - В файл *.class";
                System.out.println(question2[i]);
            } else if (i == 3) {
                question2[i] = "3 - В файл *.exe";
                System.out.println(question2[i]);
            } else if (i == 4) {
                question2[i] = "4 - В файл *.mp4";
                System.out.println(question2[i]);
            }
        }
        System.out.println("Введите Ваш ответ и нажминете Enter:");
        x = s.nextInt();
        for (int k = 0; k < 100000; k++) {
            if (x == 2) {
                //System.out.println("Ваш ответ верный");
                result2 = true;
                break;
            } else if (x == 1 || x == 3 || x == 4) {
                //System.out.println("Ваш ответ НЕ верный");
                result2 = false;
                break;
            } else {
                System.out.println("Вы ввели не верное число, повторите ввод");
                x = s.nextInt();
            }
        }

        System.out.println();

        //ТРЕТИЙ ВОПРОС
        for (int i = 0; i < question3.length; i++) {
            if (i == 0) {
                question3[i] = "Что такое компиляция?";
                System.out.println(question3[i]);
            } else if (i == 1) {
                question3[i] = "1 - Исполнение программы \"на лету\"";
                System.out.println(question3[i]);
            } else if (i == 2) {
                question3[i] = "2 - Полное преобразование кода программы в машинный язык";
                System.out.println(question3[i]);
            } else if (i == 3) {
                question3[i] = "3 - Компьютерная инсталляция";
                System.out.println(question3[i]);
            }
        }
        System.out.println("Введите Ваш ответ и нажминете Enter:");
        x = s.nextInt();
        for (int k = 0; k < 100000; k++) {
            if (x == 2) {
                // System.out.println("Ваш ответ верный");
                result3 = true;
                break;
            } else if (x == 1 || x == 3) {
                // System.out.println("Ваш ответ НЕ верный");
                result3 = false;
                break;
            } else {
                System.out.println("Вы ввели не верное число, повторите ввод");
                x = s.nextInt();
            }
        }

        System.out.println();

        //РЕЗУЛЬТАТЫ

        System.out.println("Ваши результаты: ");
        if (result1) {
            System.out.println("Первый вопрос - верно");
        } else
            System.out.println("Первый вопрос - НЕ верно");


        if (result2) {
            System.out.println("Второй вопрос - верно");
        } else
            System.out.println("Второй вопрос - НЕ верно");

        if (result3) {
            System.out.println("Третий вопрос - верно");
        } else
            System.out.println("Третий вопрос - НЕ верно");

    }
}
