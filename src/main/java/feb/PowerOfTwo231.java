package feb;

/**
 * Created By think
 * Created At 2021/2/1 23:44
 */
public class PowerOfTwo231 {

    public static boolean isPowerOfTwo(int n) {
        if(n == 1){
            return true;
        }
        if(0 == n){
            return false;
        }
        while(n!=2 && n%2==0){
            n = n /2;
        }
        if(n==2){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(3));
    }

}
