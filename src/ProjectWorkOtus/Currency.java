package ProjectWorkOtus;

public class Currency implements CurrencyInterface {
    private String nameForFractionalNumber; // Название валюты с дробной частью
    private String nameForPlural; // Название валюты во множественном числе
    private String nameForSingular; // Название валюты в едиственном числе

    public void setNameForFractionalNumber(String nameForFractionalNumber) {
        this.nameForFractionalNumber = nameForFractionalNumber;
    }

    public void setNameForPlural(String nameForPlural) {
        this.nameForPlural = nameForPlural;
    }

    public void setNameForSingular(String nameForSingular) {
        this.nameForSingular = nameForSingular;
    }

    public String writingCurrency(double inputSumDouble) {
        String stringToWrite = "";
        int wholePart = (int) inputSumDouble; //Целая часть
        double fractionalPart = inputSumDouble - wholePart; // дробная часть
        int lastСharacterWholePart = wholePart % 10; // крайний сиввол в целой части
        int twoLastСharacterWholePart = wholePart % 100; // крайние два символа в целой части

        if (inputSumDouble > (1 * Math.pow(10, 14)))
            throw new NumberFormatException();

        else if (inputSumDouble < 0)
            throw new NumberFormatException();

        else if (fractionalPart > 0)
            stringToWrite = this.nameForFractionalNumber;

        else if (fractionalPart == 0) {

            if (wholePart < 20 && wholePart > 10)
                stringToWrite = this.nameForPlural;

            else if (twoLastСharacterWholePart < 20 && twoLastСharacterWholePart > 10)
                stringToWrite = this.nameForPlural;

            else if (wholePart == 1 || lastСharacterWholePart == 1)
                stringToWrite = this.nameForSingular;

            else if (wholePart == 2 || wholePart == 3 || wholePart == 4 ||
                    lastСharacterWholePart == 2 || lastСharacterWholePart == 3 || lastСharacterWholePart == 4)
                stringToWrite = this.nameForFractionalNumber;

            else stringToWrite = this.nameForPlural;
        }

       return stringToWrite;
    }

}
