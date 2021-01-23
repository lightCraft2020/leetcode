package competition;

/**
 * Created By think
 * Created At 2021/1/23 23:03
 */
public class Solution5645 {

    public static int largestAltitude(int[] gain) {
        int n = gain.length;
        int max = 0;
        int curr = 0;
        for (int i = 1; i < n+1; i++) {
            curr = curr+ gain[i-1];
            max = Math.max(curr,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr= new int[]{-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(arr));
    }


}
