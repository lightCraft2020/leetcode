package feb;

import java.util.Arrays;

/**
 * Created By think
 * Created At 2021/2/21 23:29
 */
public class LargestPerimeter976 {

    public static int largestPerimeter(int[] A) {
        Arrays.sort(A);
        int n = A.length;
        int sum = 0;
        int i = n-1;
        while(i >= 2){
            if(A[i-1] + A[i-2] <= A[i]){
                i--;
            } else {
                sum = A[i] + A[i-1] + A[i-2];
                break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 1};
        System.out.println(largestPerimeter(A));
    }



}
