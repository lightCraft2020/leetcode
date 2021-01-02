package december;

public class SingleNumber136 {

    public static int singleNumber(int[] nums) {
        int a = nums[0];
        for(int i=1;i<nums.length; i++){
            a^=nums[i];
        }
        return a;
    }


    public static void main(String[] args) {
        int[] nums = {0,1,2,0,2,1,5};
        System.out.println(singleNumber(nums));

    }
}
