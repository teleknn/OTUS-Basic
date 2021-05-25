package HomeWorkTesting.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConsoleServiceLogger implements ServiceLogger {
    //Задаем формат для вывода даты
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

    @Override
    public void log(String message) {
        //Переопределяем метод, добавил LineSeparator более универсально вместо \r\n
        System.out.printf("%s\t%s" + System.lineSeparator(), LocalDateTime.now().format(formatter), message);
    }
}
