package projectWorkOtus;

public class CurrencyApplication {
    private final IOService ioService;
    private final Currency currency;
    private final FormatString formatString;

    public CurrencyApplication(IOService ioService, Currency currency, FormatString formatString) {
        this.ioService = ioService;
        this.currency = currency;
        this.formatString = formatString;
    }

    public void run() {

        while (true) {
            ioService.outputDate("Введите сумму (exit для выходы): ");
            String inputSumString = ioService.inputDate();
            if (inputSumString.equals("exit")) {
                ioService.outputDate("До свидания!");
                break;
            }

            try {
                double inputSumDouble = Double.parseDouble(formatString.reformatInput(inputSumString));
                System.out.println(String.format("%.2f", inputSumDouble) + " " +
                        currency.writeCurrency(inputSumDouble) + "\n");

            } catch (NumberFormatException e) {
                ioService.outputDate("Ошибка ввода! Неправильный формат" + "\n");
            }

        }

    }
}

