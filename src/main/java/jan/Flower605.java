package jan;

/**
 * Created By think
 * Created At 2021/1/2 17:51
 */
public class Flower605 {


    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(allZeros(flowerbed)){
            return (flowerbed.length+1)/2 >= n;
        }
        int c = 0;
        int total = 0;
        boolean head  = true;
        for (int i = 0; i <flowerbed.length ; i++) {
            int a = flowerbed[i];
            if(1 == a){
                if(head){
                    total+=c/2;
                } else {
                    total+=(c-1)/2;
                }
                c=0;
                head = false;
            } else {
                c++;
            }
        }
        if(c > 0){
            total+=c/2;
        }
        return total >= n;
    }

    private static boolean allZeros(int[] flowerbed){
        for (int i = 0; i <flowerbed.length; i++) {
            if(0 != flowerbed[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }


}
