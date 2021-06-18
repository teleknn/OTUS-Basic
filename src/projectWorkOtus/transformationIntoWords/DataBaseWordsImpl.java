package projectWorkOtus.transformationIntoWords;

public class DataBaseWordsImpl implements DataBaseWords {

    public String getHundreds(long dig) {
        int digForLoop = (int) dig;
        switch (digForLoop) {
            case 1:
                return "сто";
            case 2:
                return "двести";
            case 3:
                return "триста";
            case 4:
                return "четыреста";
            case 5:
                return "пятьсот";
            case 6:
                return "шестсот";
            case 7:
                return "семьсот";
            case 8:
                return "восемсот";
            case 9:
                return "девятьсот";
            default:
                return null;
        }
    }

    public String getDecades(long dig) {
        int digForLoop = (int) dig;
        switch (digForLoop) {
            case 1:
                return "десять";
            case 2:
                return "двадцать";
            case 3:
                return "тридцать";
            case 4:
                return "сорок";
            case 5:
                return "пятьдесят";
            case 6:
                return "шестьдесят";
            case 7:
                return "семьдесят";
            case 8:
                return "восемьдесят";
            case 9:
                return "девяносто";
            default:
                return null;
        }
    }

    public String getUnits(long dig, boolean female) {
        int digForLoop = (int) dig;
        switch (digForLoop) {
            case 1:
                return female ? "одна" : "один";
            case 2:
                return female ? "две" : "два";
            case 3:
                return "три";
            case 4:
                return "четыре";
            case 5:
                return "пять";
            case 6:
                return "шесть";
            case 7:
                return "семь";
            case 8:
                return "восемь";
            case 9:
                return "девять";
            default:
                return null;
        }
    }

    public String getTeens(long dig) {
        int digForLoop = (int) dig;
        switch (digForLoop) {
            case 1:
                return "одиннадцать";
            case 2:
                return "двенадцать";
            case 3:
                return "тринадцать";
            case 4:
                return "четырнадцать";
            case 5:
                return "пятнадцать";
            case 6:
                return "шестнадцать";
            case 7:
                return "семнадцать";
            case 8:
                return "восемнадцать";
            case 9:
                return "девятнадцать";
            default:
                return null;
        }

    }

    public String getDigit(long dig) {
        int digForLoop = (int) dig;
        switch (digForLoop) {
            case 0:
                return "";
            case 1:
                return "тысяча ";
            case 2:
                return "тысячи ";
            case 3:
                return "тысяч ";
            case 4:
                return "миллион ";
            case 5:
                return "миллиона ";
            case 6:
                return "миллионов ";
            case 7:
                return "миллиард ";
            case 8:
                return "миллиарда ";
            case 9:
                return "миллирдов ";
            case 10:
                return "триллион ";
            case 11:
                return "триллиона ";
            case 12:
                return "триллионов ";
            default:
                return null;
        }
    }
}