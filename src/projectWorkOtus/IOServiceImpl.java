package projectWorkOtus;

import java.util.Scanner;

public class IOServiceImpl implements IOService {

    public String inputData() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void outputData(String message) {
        System.out.println(message);
    }

}