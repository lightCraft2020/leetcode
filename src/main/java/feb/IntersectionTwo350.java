package feb;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created By think
 * Created At 2021/2/19 23:11
 */
public class IntersectionTwo350 {

    public static int[] intersect(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        List<Integer> ret = new ArrayList<>();
        List<Integer> listOne = new ArrayList<>();
        for (int i = 0; i <m ; i++) {
            listOne.add(nums1[i]);
        }
        for (int i = 0; i <n ; i++) {
            int index = listOne.indexOf(nums2[i]);
            if(index >= 0){
                ret.add(nums2[i]);
                listOne.remove(index);
            }
        }
        int[] arr = new int[ret.size()];
        int i = 0;
        for(Integer item : ret){
            arr[i++] = item;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{4,9,5};
        int[] num2 = new int[]{9,4,9,8,4};
        int[] ret = intersect(num1, num2);
        System.out.println(ret);
    }


}
