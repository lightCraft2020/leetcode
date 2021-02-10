package feb;

import java.util.HashSet;

/**
 * Created By think
 * Created At 2021/2/10 23:12
 */
public class PowerOfThree326 {

    public boolean isPowerOfThree2(int n) {
        if(n <= 0){
            return false;
        }
        if(1 == n){
            return true;
        }
        while(n % 3 == 0){
            n = n / 3;
        }
        if(1 == n){
            return true;
        }
        return false;
    }

    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }

}
