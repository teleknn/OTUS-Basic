package projectWorkOtus;

import java.util.Scanner;

public class IOServiceImpl implements IOService {

    public String inputDate() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void outputDate(String message) {
        System.out.println(message);
    }

}