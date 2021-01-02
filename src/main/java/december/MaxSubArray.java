package december;

public class MaxSubArray {


    public static int maxSubArray(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
           max = Math.max(nums[i],max);
        }
        if(max <=0){
            return max;
        }

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(sum>0){
                sum+=nums[i];
            } else{
                sum=nums[i];
            }
            max = Math.max(sum,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));

    }
}
