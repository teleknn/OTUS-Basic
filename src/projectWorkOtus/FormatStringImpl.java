package projectWorkOtus;

public class FormatStringImpl implements FormatString {

    public String reformatInput(String message) {
        String reformatStr = message.replace(',', '.');
        reformatStr = reformatStr.replace(" ", "");
        return reformatStr;
    }
}
