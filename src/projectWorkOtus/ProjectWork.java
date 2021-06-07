package projectWorkOtus;

public class ProjectWork {
    public static void main(String[] args) {

        IOService ioService = new IOServiceImpl();
        Currency currency = new CurrencyImpl("рубля", "рублей", "рубль");
        // nameForFractionalNumber - Название валюты с дробной частью
        // nameForPlural - Название валюты во множественном числе
        // nameForSingular - Название валюты в едиственном числе
        FormatString formatString = new FormatStringImpl();

        CurrencyApplication currencyApplication = new CurrencyApplication(ioService, currency, formatString);
        currencyApplication.run();

    }
}
