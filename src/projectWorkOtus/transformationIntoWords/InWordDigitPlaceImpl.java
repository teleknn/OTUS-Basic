package projectWorkOtus.transformationIntoWords;

public class InWordDigitPlaceImpl implements InWordDigitPlace {
    long[] arrayNumbers;
    int flagDigit;
    boolean female;
    int unitNumberPositionArr;
    int tenNumberPositionArr;
    int hundredsNumberPositionArr;
    int[] dbKeyArray;

    DataBaseWords dataBaseWords = new DataBaseWordsImpl();


    public InWordDigitPlaceImpl(long[] arrayNumbers, int flagDigit, boolean female) {
        this.arrayNumbers = arrayNumbers;
        this.unitNumberPositionArr = arrayNumbers.length - 1;
        this.tenNumberPositionArr = arrayNumbers.length - 2;
        this.hundredsNumberPositionArr = arrayNumbers.length - 3;
        this.flagDigit = flagDigit;
        this.female = female;
    }


    public int[] toCreateArrayDbKeys(int flagDigit) {
        int[] dbKeyArrayNumber = new int[3];
        if (flagDigit == 1) {
            dbKeyArrayNumber[0] = 0;
            dbKeyArrayNumber[1] = 0;
            dbKeyArrayNumber[2] = 0;
            return dbKeyArrayNumber;
        }
        if (flagDigit == 2) {
            dbKeyArrayNumber[0] = 1;
            dbKeyArrayNumber[1] = 2;
            dbKeyArrayNumber[2] = 3;
            return dbKeyArrayNumber;
        }

        if (flagDigit == 3) {
            dbKeyArrayNumber[0] = 4;
            dbKeyArrayNumber[1] = 5;
            dbKeyArrayNumber[2] = 6;
            return dbKeyArrayNumber;
        }
        if (flagDigit == 4) {
            dbKeyArrayNumber[0] = 7;
            dbKeyArrayNumber[1] = 8;
            dbKeyArrayNumber[2] = 9;
            return dbKeyArrayNumber;
        }
        if (flagDigit == 5) {
            dbKeyArrayNumber[0] = 10;
            dbKeyArrayNumber[1] = 11;
            dbKeyArrayNumber[2] = 12;
            return dbKeyArrayNumber;
        }
        return dbKeyArrayNumber;

    }


    public void transformUnit() {
        dbKeyArray = toCreateArrayDbKeys(flagDigit);

        if (arrayNumbers[unitNumberPositionArr] == 0) {
            return;
        }
        if (arrayNumbers[unitNumberPositionArr] == 1) {
            System.out.print(dataBaseWords.getUnits(arrayNumbers[unitNumberPositionArr], female) + " ");
            System.out.print(dataBaseWords.getDigit(dbKeyArray[0]));
            return;
        }
        if (arrayNumbers[unitNumberPositionArr] > 1 && arrayNumbers[unitNumberPositionArr] < 5) {
            System.out.print(dataBaseWords.getUnits(arrayNumbers[unitNumberPositionArr], female) + " ");
            System.out.print(dataBaseWords.getDigit(dbKeyArray[1]));
            return;
        }
        System.out.print(dataBaseWords.getUnits(arrayNumbers[unitNumberPositionArr], female) + " ");
        System.out.print(dataBaseWords.getDigit(dbKeyArray[2]));
    }

    public void transformTen() {

        dbKeyArray = toCreateArrayDbKeys(flagDigit);

        if (arrayNumbers.length < 2) {
            this.transformUnit();
            return;
        }
        if (arrayNumbers[tenNumberPositionArr] == 0) {
            this.transformUnit();
            return;
        }
        if (arrayNumbers[tenNumberPositionArr] == 0 && arrayNumbers[unitNumberPositionArr] == 0) {
            return;
        }
        if (arrayNumbers[tenNumberPositionArr] >= 1 && arrayNumbers[tenNumberPositionArr] <= 9
                && arrayNumbers[unitNumberPositionArr] == 0) {
            System.out.print(dataBaseWords.getDecades(arrayNumbers[tenNumberPositionArr]) + " ");
            System.out.print(dataBaseWords.getDigit(dbKeyArray[2]));
            return;
        }
        if (arrayNumbers[tenNumberPositionArr] == 1
                && arrayNumbers[unitNumberPositionArr] >= 1 &&
                arrayNumbers[unitNumberPositionArr] <= 9) {
            System.out.print(dataBaseWords.getTeens(arrayNumbers[unitNumberPositionArr]) + " ");
            System.out.print(dataBaseWords.getDigit(dbKeyArray[2]));
            return;
        }
        System.out.print(dataBaseWords.getDecades(arrayNumbers[tenNumberPositionArr]) + " ");
        this.transformUnit();
    }

    public void transformHundreds() {
        dbKeyArray = toCreateArrayDbKeys(flagDigit);

        if (arrayNumbers.length < 3) {
            this.transformTen();
            return;
        }
        if (arrayNumbers[hundredsNumberPositionArr] == 0) {
            this.transformTen();
            return;
        }
        if (arrayNumbers[hundredsNumberPositionArr] >= 1 && arrayNumbers[hundredsNumberPositionArr] <= 9
                && arrayNumbers[tenNumberPositionArr] == 0 && arrayNumbers[unitNumberPositionArr] == 0) {
            System.out.print(dataBaseWords.getHundreds(arrayNumbers[hundredsNumberPositionArr]) + " ");
            System.out.print(dataBaseWords.getDigit(dbKeyArray[2]));
            return;
        }
        System.out.print(dataBaseWords.getHundreds(arrayNumbers[hundredsNumberPositionArr]) + " ");
        this.transformTen();
    }

    public void transformStart() {
        this.transformHundreds();
    }

}

