package projectWorkOtus;

import projectWorkOtus.transformationIntoWords.TransformationIntoWordsApp;

public class ProjectWork {
    public static void main(String[] args) {

        IOService ioService = new IOServiceImpl();
        Currency currency = new CurrencyImpl("рубля", "рублей", "рубль",
                "копеек", "копейка", "копейки");
        // nameForFractionalNumber - Название валюты с дробной частью
        // nameForPlural - Название валюты во множественном числе
        // nameForSingular - Название валюты в едиственном числе
        // nameForSingular -  Название валюты в едиственном числе
        // nameCoinSingular - Название копеек единственном числе
        // nameCoinPlural - Название копеек во множественном числе
        // nameCoinSpecial - Название копеек исключения
        FormatString formatString = new FormatStringImpl();
        TransformationIntoWordsApp transformationIntoWordsApp = new TransformationIntoWordsApp();

        CurrencyApplication currencyApplication = new CurrencyApplication(ioService, currency, formatString, transformationIntoWordsApp);
        currencyApplication.run();

    }
}
