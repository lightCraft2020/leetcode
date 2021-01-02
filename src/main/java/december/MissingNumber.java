package december;

import java.util.HashSet;
import java.util.Set;

/**
 * think
 * Created By 2020/12/31 22:31
 */
public class MissingNumber {


    public static int missingNumber(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n ; i++) {
            set.add(nums[i]);
        }

        for (int i = 0; i <= n; i++) {
            if(!set.contains(i)){
                return i;
            }
        }
        return 0;
    }

    public static int missingNumber2(int[] nums) {
        int n = nums.length;
        int t = n;
        int sum = 0;
        for (int i = 0; i < n ; i++) {
            sum+=nums[i];
            t+=i;
        }
        return t-sum;
    }

    public static void main(String[] args) {
        int[] n = {0};
        System.out.println(missingNumber2(n));

    }
}
