package jan;

import java.util.Arrays;

/**
 * Created By think
 * Created At 2021/1/27 23:51
 */
public class FindKthLargest215 {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

}
