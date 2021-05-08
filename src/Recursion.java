public class Recursion {
    public static void main(String[] args) {

        System.out.println(summ(0));
    }

    public static int summ(int i) {
        if (i == 6)
            return 0;

        System.out.println(i);
        return i + summ((i + 1));

    }
}
