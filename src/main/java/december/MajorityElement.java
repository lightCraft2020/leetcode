package december;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Created By think
 * Created At 2020/12/31 23:04
 */
public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int a = n /2 + 1;
        int b = n /2 - 1;
        Arrays.sort(nums);
        int m = nums[n/2];
        if(getCount(nums, m) >= n /2 + 1){
            return m;
        }

        return -1;
    }

    private static int getCount(int[] nums, int m){
        int count = 0;
        for (int i: nums) {
            if(m == i){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,9,5,9,5,5,5};
        Integer[] a = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i];
        }
        Arrays.sort(a, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(majorityElement(arr));

    }

}
