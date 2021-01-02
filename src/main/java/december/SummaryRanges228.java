package december;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges228 {

    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if(nums.length == 0){
            return list;
        }
        if(nums.length == 1 || nums[0] == nums[nums.length -1]){
            list.add(nums[0]+"");
            return list;
        }

        int s = nums[0];
        int t = nums[0];
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]+1 != nums[i+1]){
                t = nums[i];
                if(s == t){
                    list.add(s+"");
                } else{
                    list.add(s+"->"+t);
                }
                s = nums[i+1];
                t = nums[i+1];
            } else{
                t = nums[i+1];
            }
        }

        if(t != nums[0]){
            if(s!=t){
                list.add(s+"->"+t);
            } else{
                list.add(s+"");
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] nums = {0,2,3,4,6,8,9};

        System.out.println(String.join(",",summaryRanges(nums) ));
    }

}
