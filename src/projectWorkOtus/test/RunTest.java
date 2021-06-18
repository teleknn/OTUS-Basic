package projectWorkOtus.test;

public class RunTest {
    public static void main(String[] args) {
        TestExecutor.doTest("Тест с числом с дробной частью",
                () -> new CurrencyTests().testCurrencyWithFractionalNumber());

        TestExecutor.doTest("Тест с исключением число 5",
                () -> new CurrencyTests().testCurrencyWithExclusionNumber5());

        TestExecutor.doTest("Тест с исключением число 1",
                () -> new CurrencyTests().testCurrencyWithExclusionNumber1());

        TestExecutor.doTest("Тест с отрицательным числом -10",
                () -> new CurrencyTests().testCurrencyWithNegativnumber());

        TestExecutor.doTest("Тест с очень большим числом 2323423423232423423324.00",
                () -> new CurrencyTests().testCurrencyWithBigNumber());

        TestExecutor.doTest("Тест класса FormatString",
                () -> new FormatStringTest().testFormatString());


    }


}
