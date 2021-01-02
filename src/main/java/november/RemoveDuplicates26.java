package november;

public class RemoveDuplicates26 {


    public static int removeDuplicates(int[] nums) {
        int count = 1;

        int len = nums.length;
        if(len<=1) return len;
        int max = nums[nums.length-1];
        for (int i = 1; i < nums.length; i++) {
            if(max == nums[i-1]){
                break;
            }
            if(nums[i] - nums[i-1] <= 0){
                for (int j = i+1; j < nums.length; j++) {
                    if(nums[j] - nums[i] > 0 && nums[j] > nums[i-1]){
                        count++;
                        nums[i] = nums[j];
                        break;
                    }
                }
            } else {
                count++;
            }
        }



        return count;
    }


    public static void main(String[] args) {
        //int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
        System.out.println("end");
    }
}
