package december;

public class SearchInsert35 {

    public static int searchInsert(int[] nums, int target) {
        if(nums.length == 0){
            return 0;
        } else if(nums.length == 1){
            return nums[0] > target? 0:1;
        } else {
            boolean flag = nums[nums.length -1] > nums[0];

            for (int i = 0; i <nums.length ; i++) {
                if(flag){
                    if(nums[i] >= target){
                        return i;
                    }
                } else{
                    if(nums[i] <= target){
                        return i;
                    }
                }
            }
            return nums.length;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int target = 2;
        System.out.println(searchInsert(nums,target));
    }
}
