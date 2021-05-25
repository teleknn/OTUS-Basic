package HomeWorkTesting.test;

import HomeWorkTesting.test.assertions.TestExecutor;

public class RunTests {
    public static void main(String[] args) {


        TestExecutor.doTest("V1. Тест: переданы одинаковые параметры, ждем исключение",
                () -> new EventServiceTest().testThrowExceptionIfEqPrm());

        TestExecutor.doTest("V2. Тест: первое значение больше второго, ждем исключение",
                () -> new EventServiceTest().testFirstParamGtSecondPrm());

        TestExecutor.doTest("V3. Тест: после объединнения id от второго события ",
                () -> new EventServiceTest().testResultIdEvent());

        TestExecutor.doTest("V4. Тест: правильность имени обьеденного события ",
                () -> new EventServiceTest().testResultEventMessage());


        System.out.println("\n\n----------------------\n\n");

        TestExecutor.doTest("V1. Тест: переданы одинаковые параметры, ждем исключение",
                () -> new EventServiceTest().testThrowExceptionIfEqPrmCorrect());

        TestExecutor.doTest("V2. Тест: первое значение больше второго, ждем исключение",
                () -> new EventServiceTest().testFirstParamGtSecondPrmCorrect());

        TestExecutor.doTest("V3. Тест: после объединнения id от второго события ",
                () -> new EventServiceTest().testResultEventIdCorrect());

        TestExecutor.doTest("V4. Тест: правильность имени обьеденного события ",
                () -> new EventServiceTest().testResultEventMessageCorrect());






    }



}
