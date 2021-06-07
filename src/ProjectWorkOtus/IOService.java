package ProjectWorkOtus;

import java.util.Scanner;

public class IOService implements IOServiceInterface {

    public String inputDate() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void outputDate(String message) {
        System.out.println(message);
    }

    public String reformatInput(String message) {
        String reformatStr = message.replace(',', '.');
        reformatStr = reformatStr.replace(" ", "");
        return reformatStr;
    }
}