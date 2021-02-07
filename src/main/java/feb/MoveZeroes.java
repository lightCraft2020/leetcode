package feb;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By think
 * Created At 2021/2/7 21:58
 */
public class MoveZeroes {

    public static void moveZeroes2(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                list.add(nums[i]);
            } else{
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            list.add(0);
        }
        for (int i = 0; i <list.size() ; i++) {
            nums[i] = list.get(i);
        }
    }

    public static void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[count++] = nums[i];
            }
        }
        for (int i = count; i < nums.length; i++) {
            nums[count++] = 0;
        }
    }

}
