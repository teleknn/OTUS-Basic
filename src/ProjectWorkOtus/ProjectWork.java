package ProjectWorkOtus;

public class ProjectWork {
    public static void main(String[] args) throws Exception {

        IOServiceInterface ioService = new IOService();
        CurrencyInterface currency = new Currency();
        currency.setNameForPlural("рублей"); //Название валюты во множественном числе
        currency.setNameForSingular("рубль"); //Название валюты в едиственном числе
        currency.setNameForFractionalNumber("рубля"); //Название валюты с дробной частью

        CurrencyApplication currencyApplication = new CurrencyApplication(ioService, currency);
        currencyApplication.run();

    }
}
