package jan;

/**
 * Created By think
 * Created At 2021/1/27 23:53
 */
public class LargestAltitude1732 {
    public int largestAltitude(int[] gain) {
        int[] a = new int[gain.length +1];
        a[0] = 0;
        int max = 0;
        int sum = 0;
        for (int i = 0; i < gain.length; i++) {
            sum = sum + gain[i];
            max = Math.max(sum, max);
        }
        return max;
    }
}
