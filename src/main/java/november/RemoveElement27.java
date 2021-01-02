package november;


public class RemoveElement27 {

    public static int removeElement(int[] nums, int val) {
        int c=0;
        int k=0;
        for(int i = 0; i< nums.length; i++){
            if(val != nums[i]){
                c++;
            } else {
                for(int j=i+1; j< nums.length; j++){
                    if(val != nums[j]){
                        int t = nums[i];
                        nums[i] = nums[j];
                        nums[j]=t;
                        //k=j+1;
                        c++;
                        break;
                    }
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println(removeElement(nums, 3));
    }
}
