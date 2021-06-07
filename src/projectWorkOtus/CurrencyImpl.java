package projectWorkOtus;

public class CurrencyImpl implements Currency {
    private String nameForFractionalNumber; // Название валюты с дробной частью
    private String nameForPlural; // Название валюты во множественном числе
    private String nameForSingular; // Название валюты в едиственном числе

    public CurrencyImpl(String nameForFractionalNumber, String nameForPlural, String nameForSingular) {
        this.nameForFractionalNumber = nameForFractionalNumber;
        this.nameForPlural = nameForPlural;
        this.nameForSingular = nameForSingular;
    }

    public String writeCurrency(double inputSumDouble) {

        if (inputSumDouble > (1 * Math.pow(10, 14)))
            throw new NumberFormatException();

        if (inputSumDouble < 0)
            throw new NumberFormatException();

        long wholePart = (long) inputSumDouble; //Целая часть
        double fractionalPart = inputSumDouble - wholePart; // дробная часть
        long lastСharacterWholePart = wholePart % 10; // крайний символ в целой части
        long twoLastСharacterWholePart = wholePart % 100; // крайние два символа в целой части

        if (fractionalPart > 0)
            return this.nameForFractionalNumber;


        if (wholePart < 20 && wholePart > 10)
                return this.nameForPlural;

        else if (twoLastСharacterWholePart < 20 && twoLastСharacterWholePart > 10)
                return this.nameForPlural;

        else if (wholePart == 1 || lastСharacterWholePart == 1)
                return this.nameForSingular;

        else if (wholePart == 2 || wholePart == 3 || wholePart == 4 ||
                    lastСharacterWholePart == 2 || lastСharacterWholePart == 3 || lastСharacterWholePart == 4)
                return this.nameForFractionalNumber;

        return this.nameForPlural;
    }

}
