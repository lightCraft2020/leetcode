package december;

public class ReverseInteger7 {


    public static int reverse(int x) {
        long n = 0;

        while (x != 0) {
            n = 10 * n + x % 10;
            x = x / 10;
        }

        return n ==(int) n ? (int)n : 0;
    }

    public static void main(String[] args) {
        System.out.println(reverse(120));

    }



}
