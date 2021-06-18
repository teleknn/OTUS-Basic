package projectWorkOtus;

public class CurrencyImpl implements Currency {
    private final String nameForFractionalNumber; // Название валюты с дробной частью
    private final String nameForPlural; // Название валюты во множественном числе
    private final String nameForSingular; // Название валюты в едиственном числе
    private final String nameCoinSingular; //Название копеек единственном числе
    private final String nameCoinPlural; //Название копеек во множественном числе
    private final String nameCoinSpecial; //Название копеек исключения

    public CurrencyImpl(String nameForFractionalNumber, String nameForPlural, String nameForSingular,
                        String nameCoinPlural, String nameCoinSingular, String nameCoinSpecial) {
        this.nameForFractionalNumber = nameForFractionalNumber;
        this.nameForPlural = nameForPlural;
        this.nameForSingular = nameForSingular;
        this.nameCoinPlural = nameCoinPlural;
        this.nameCoinSingular = nameCoinSingular;
        this.nameCoinSpecial = nameCoinSpecial;
    }

    public String writeCurrency(double inputSumDouble) {

        if (inputSumDouble > (1 * Math.pow(10, 16)))
            throw new NumberFormatException();

        if (inputSumDouble < 0)
            throw new NumberFormatException();

        long wholePart = (long) inputSumDouble; //Целая часть
        long lastСharacterWholePart = wholePart % 10; // крайний символ в целой части
        long twoLastСharacterWholePart = wholePart % 100; // крайние два символа в целой части

        if (wholePart == 0) {
            return "ноль " + this.nameForPlural;
        }
        if (wholePart < 20 && wholePart > 10) {
            return this.nameForPlural;
        }
        if (twoLastСharacterWholePart < 20 && twoLastСharacterWholePart > 10) {
            return this.nameForPlural;
        }
        if (wholePart == 1 || lastСharacterWholePart == 1) {
            return this.nameForSingular;
        }
        if (wholePart == 2 || wholePart == 3 || wholePart == 4 ||
                lastСharacterWholePart == 2 || lastСharacterWholePart == 3 || lastСharacterWholePart == 4) {
            return this.nameForFractionalNumber;
        }
        return this.nameForPlural;
    }

    public String writeCoin(double inputSumDouble) {
        if (inputSumDouble > (1 * Math.pow(10, 16)))
            throw new NumberFormatException();

        if (inputSumDouble <= 0)
            throw new NumberFormatException();

        if (inputSumDouble < 0.01) {
            throw new NumberFormatException();
        }

        double fractionalPartCoinTemp = inputSumDouble % 1 * 100;
        double fractionalPartCoinTempRound = Math.round(fractionalPartCoinTemp);
        long fractionalPartCoin = (long) fractionalPartCoinTempRound; // дробная часть копеек

        long lastСharacterWholePartCoin = fractionalPartCoin % 10; // крайний символ в целой части копеек
        long twoLastСharacterWholePartCoin = fractionalPartCoin % 100; // крайние два символа в целой части копеек

        if (fractionalPartCoin < 20 && fractionalPartCoin > 10) {
            return this.nameCoinPlural;
        }
        if (twoLastСharacterWholePartCoin < 20 && twoLastСharacterWholePartCoin > 10) {
            return this.nameCoinPlural;
        }
        if (fractionalPartCoin == 1 || lastСharacterWholePartCoin == 1) {
            return this.nameCoinSingular;
        }
        if (fractionalPartCoin == 2 || fractionalPartCoin == 3 || fractionalPartCoin == 4 ||
                lastСharacterWholePartCoin == 2 || lastСharacterWholePartCoin == 3 || lastСharacterWholePartCoin == 4) {
            return this.nameCoinSpecial;
        }

        return this.nameCoinPlural;
    }

}
