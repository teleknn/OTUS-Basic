package projectWorkOtus.test;

import projectWorkOtus.FormatStringImpl;

public class FormatStringTest {

    FormatStringImpl formatString = new FormatStringImpl();

    public void testFormatString() {

        String actual = formatString.reformatInput("23 23,32 3");
        Assertions.assertEquals("2323.323", actual);
    }



}
