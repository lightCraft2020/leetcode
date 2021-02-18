package feb;

import java.util.*;

/**
 * Created By think
 * Created At 2021/2/18 22:06
 */
public class Intersection349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        Set<Integer> ret = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <m ; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i <n ; i++) {
            if(set.contains(nums2[i])){
                ret.add(nums2[i]);
            }
        }
        int[] arr = new int[ret.size()];
        int i = 0;
        for(Integer item : ret){
            arr[i++] = item;
        }
        return arr;
    }

}
