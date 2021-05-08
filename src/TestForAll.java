import java.util.Arrays;

public class TestForAll {
    public static void main(String[] args) {
        String[] s = {"1","2","3"};
        String q = "1";
        boolean r = Arrays.asList(s).contains(q);
        System.out.println(r);
    }
}
