package projectWorkOtus;

import projectWorkOtus.transformationIntoWords.TransformationIntoWordsApp;

public class CurrencyApplication {
    private final IOService ioService;
    private final Currency currency;
    private final FormatString formatString;
    private final TransformationIntoWordsApp transformationIntoWordsApp;

    public CurrencyApplication(IOService ioService, Currency currency, FormatString formatString,
                               TransformationIntoWordsApp transformationIntoWordsApp) {
        this.ioService = ioService;
        this.currency = currency;
        this.formatString = formatString;
        this.transformationIntoWordsApp = transformationIntoWordsApp;
    }

    public void run() {

        while (true) {
            ioService.outputData("Введите сумму (exit для выходы): ");
            String inputSumString = ioService.inputData();
            if (inputSumString.equals("exit")) {
                ioService.outputData("До свидания!");
                break;
            }

            try {
                double inputSumDouble = Double.parseDouble(formatString.reformatInput(inputSumString));
                long num = (long) inputSumDouble;
                double fractionalPartCoinTemp = inputSumDouble % 1 * 100;
                double fractionalPartCoinTempRound = Math.round(fractionalPartCoinTemp);
                long fractionalPartCoin = (long) fractionalPartCoinTempRound; // дробная часть

                transformationIntoWordsApp.runTransformationIntoWordsApp(num);
                System.out.print(currency.writeCurrency(inputSumDouble) + " " + fractionalPartCoin + " " +
                        currency.writeCoin(inputSumDouble) + "\n");


            } catch (NumberFormatException e) {
                ioService.outputData("Ошибка ввода! Неправильный формат" + "\n");
            }

        }

    }
}

