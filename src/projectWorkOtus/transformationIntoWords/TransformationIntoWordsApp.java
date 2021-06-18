package projectWorkOtus.transformationIntoWords;

public class TransformationIntoWordsApp {

    public static void runTransformationIntoWordsApp(long num) {

        //Первый порядок цыфр
        if (digitNumber(num) >= 1 && digitNumber(num) <= 3) {

            InWordDigitPlace inWordDigitPlace =
                    new InWordDigitPlaceImpl(arrayNumbers(num, digitNumber(num)), 1, false);
            inWordDigitPlace.transformHundreds();
        }

        //Второй порядок цыфр
        if (digitNumber(num) >= 4 && digitNumber(num) <= 6) {

            InWordDigitPlace inWordDigitPlaceThousand =
                    new InWordDigitPlaceImpl(arrayTakeDigitPart(2, 2, arrayNumbers(num, digitNumber(num))), 2, true);
            inWordDigitPlaceThousand.transformStart();

            InWordDigitPlace inWordDigitPlace =
                    new InWordDigitPlaceImpl(arrayNumbers(num, digitNumber(num)), 1, false);
            inWordDigitPlace.transformStart();


        }
        //Третий порядок цыфр
        if (digitNumber(num) >= 7 && digitNumber(num) <= 9) {


            InWordDigitPlace inWordDigitPlaceMillion =
                    new InWordDigitPlaceImpl(arrayTakeDigitPart(3, 3, arrayNumbers(num, digitNumber(num))), 3, false);
            inWordDigitPlaceMillion.transformStart();

            InWordDigitPlace inWordDigitPlaceThousand =
                    new InWordDigitPlaceImpl(arrayTakeDigitPart(2, 3, arrayNumbers(num, digitNumber(num))), 2, true);
            inWordDigitPlaceThousand.transformStart();

            InWordDigitPlace inWordDigitPlace =
                    new InWordDigitPlaceImpl(arrayNumbers(num, digitNumber(num)), 1, false);
            inWordDigitPlace.transformStart();


        }
        //Четвертый порядок цыфр
        if (digitNumber(num) >= 10 && digitNumber(num) <= 12) {

            InWordDigitPlace inWordDigitPlaceBillion =
                    new InWordDigitPlaceImpl(arrayTakeDigitPart(4, 4, arrayNumbers(num, digitNumber(num))), 4, false);
            inWordDigitPlaceBillion.transformStart();

            InWordDigitPlace inWordDigitPlaceMillion =
                    new InWordDigitPlaceImpl(arrayTakeDigitPart(3, 4, arrayNumbers(num, digitNumber(num))), 3, false);
            inWordDigitPlaceMillion.transformStart();

            InWordDigitPlace inWordDigitPlaceThousand =
                    new InWordDigitPlaceImpl(arrayTakeDigitPart(2, 4, arrayNumbers(num, digitNumber(num))), 2, true);
            inWordDigitPlaceThousand.transformStart();

            InWordDigitPlace inWordDigitPlace =
                    new InWordDigitPlaceImpl(arrayNumbers(num, digitNumber(num)), 1, false);
            inWordDigitPlace.transformStart();


        }
        //Пятый порядок цыфр
        if (digitNumber(num) >= 13 && digitNumber(num) <= 15) {

            InWordDigitPlace inWordDigitPlaceTrillion =
                    new InWordDigitPlaceImpl(arrayTakeDigitPart(5, 5, arrayNumbers(num, digitNumber(num))), 5, false);
            inWordDigitPlaceTrillion.transformStart();

            InWordDigitPlace inWordDigitPlaceBillion =
                    new InWordDigitPlaceImpl(arrayTakeDigitPart(4, 5, arrayNumbers(num, digitNumber(num))), 4, false);
            inWordDigitPlaceBillion.transformStart();

            InWordDigitPlace inWordDigitPlaceMillion =
                    new InWordDigitPlaceImpl(arrayTakeDigitPart(3, 5, arrayNumbers(num, digitNumber(num))), 3, false);
            inWordDigitPlaceMillion.transformStart();

            InWordDigitPlace inWordDigitPlaceThousand =
                    new InWordDigitPlaceImpl(arrayTakeDigitPart(2, 5, arrayNumbers(num, digitNumber(num))), 2, true);
            inWordDigitPlaceThousand.transformStart();

            InWordDigitPlace inWordDigitPlace =
                    new InWordDigitPlaceImpl(arrayNumbers(num, digitNumber(num)), 1, false);
            inWordDigitPlace.transformStart();

        }
        if (digitNumber(num) >= 16) {
            throw new NumberFormatException();
        }
    }

    public static int digitNumber(long num) {
        long numTemp = (long) Math.log10(num) + 1;
        int numDigit = (int) numTemp;
        return numDigit;
    }

    public static long[] arrayNumbers(long num, int lenght) {

        long[] arrayNumbers = new long[lenght];
        for (int i = lenght - 1; i >= 0; i--) {
            arrayNumbers[i] = num % 10;
            num = num / 10;
        }
        return arrayNumbers;
    }

    public static long[] arrayTakeDigitPart(int digit, int maxDigit, long[] inputArray) {
        int lenght = inputArray.length;

        if (digit == maxDigit) {
            int indexLenght = 3 - ((maxDigit * 3) - lenght);
            int indexStart = 0;
            long[] tempArray = new long[indexLenght];
            long[] source = inputArray;
            System.arraycopy(source, indexStart, tempArray, 0, indexLenght);
            return tempArray;
        }
        int indexLenght = 3;
        int indexStart = lenght - (digit * 3);
        long[] temArray = new long[indexLenght];
        long[] source = inputArray;
        System.arraycopy(source, indexStart, temArray, 0, indexLenght);

        return temArray;
    }
}


