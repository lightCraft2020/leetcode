package jan;

import java.util.Arrays;

/**
 * Created By think
 * Created At 2021/1/1 21:08
 */
public class MaximumProduct628 {

    public static int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return Math.max(nums[n-1] * nums[n-2] * nums[n-3],
                nums[0] * nums[1] * nums[n-1]);
    }

    public static void main(String[] args) {
        //int[] a = {-100,-98,1,3,4};
        int[] a = {-4,-3,0,1,2,3};
        System.out.println(maximumProduct(a));
    }





}
