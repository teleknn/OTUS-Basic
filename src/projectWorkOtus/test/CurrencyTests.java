package projectWorkOtus.test;

import projectWorkOtus.Currency;
import projectWorkOtus.CurrencyImpl;

public class CurrencyTests {
    Currency currency = new CurrencyImpl("рубля", "рублей", "рубль",
            "копеек", "копейка", "копейки");

    public void testCurrencyWithFractionalNumber() {

        String actual = currency.writeCurrency(2323.323);
        Assertions.assertEquals("рубля", actual);
    }

    public void testCurrencyWithExclusionNumber5() {
        String actual = currency.writeCurrency(5);
        Assertions.assertEquals("рублей", actual);
    }

    public void testCurrencyWithExclusionNumber1() {
        String actual = currency.writeCurrency(1);
        Assertions.assertEquals("рубль", actual);
    }


    public void testCurrencyWithNegativnumber() {
        Assertions.assertThrows(NumberFormatException.class, () -> currency.writeCurrency(-10));

    }

    public void testCurrencyWithBigNumber() {
        Assertions.assertThrows(NumberFormatException.class, () -> currency.writeCurrency(2323423423232423423324.00));

    }


}
