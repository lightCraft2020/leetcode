package feb;

/**
 * Created By think
 * Created At 2021/2/8 22:57
 */
public class Sum371 {

    public static int getSum(int a, int b) {
        while(b != 0){
            int temp = a^b;
            b = (a&b)<<1;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(getSum(3,8));
    }



}
