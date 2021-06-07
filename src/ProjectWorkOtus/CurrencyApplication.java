package ProjectWorkOtus;

public class CurrencyApplication {
    private final IOServiceInterface ioService;
    private final CurrencyInterface currency;

    public CurrencyApplication(IOServiceInterface ioService, CurrencyInterface currency) {
        this.ioService = ioService;
        this.currency = currency;
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
                double inputSumDouble = Double.parseDouble(ioService.reformatInput(inputSumString));
                System.out.println(String.format("%.2f", inputSumDouble) + " " +
                        currency.writingCurrency(inputSumDouble) + "\n");

            } catch (NumberFormatException e) {
                ioService.outputDate("Ошибка ввода! Неправильный формат" + "\n");
            }

        }

    }
}

