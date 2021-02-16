package feb;

/**
 * Created By think
 * Created At 2021/2/16 22:29
 */
public class PerfectNumber507 {

    public static boolean checkPerfectNumber(int num) {
        if(1 == num){
            return false;
        }
        double m = Math.sqrt(num);
        int sum = 1;
        int i = 2;
        for (; i < m; i++) {
            if(num % i == 0){
                sum+=i;
                sum+= num/i;
            }
        }
        if(i*i == num){
            sum+=m;
        }
        return sum == num;
    }

    public static boolean checkPerfectNumber2(int num) {
        int sum = 0;
        for (int i = 1; i <= num/2; i++) {
            if(num % i == 0){
                sum+=i;
            }
            System.out.println(i);
        }
        System.out.println(sum);
        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(6));
    }
}
