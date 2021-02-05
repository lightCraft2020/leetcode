package feb;

import java.util.HashSet;
import java.util.Set;

/**
 * Created By think
 * Created At 2021/2/5 22:54
 */
public class HappyNumber202 {

    public static boolean isHappy(int n) {
        boolean happy = true;
        int sum = n;
        Set<Integer> set = new HashSet<>();
        while(sum != 1){
            set.add(sum);
            //System.out.println(sum);
            sum = getSum(sum);
            if(set.contains(sum)){
                happy = false;
                break;
            }
        }
        return happy;
    }
    private static int getSum(int n){
        int sum = 0;
        while(n != 0){
            int t = n%10;
            sum += Math.pow(t,2);
            n =n / 10;
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

}
