package november;

public class PalindromeNumber {


    public static boolean isPalindrome(int x) {

        if (x < 0) return false;
        int div = 1;
        int y = x;
        while(x/10>0)
        {
            x =x /10;
            div*= 10;
        }
        x= y;
        System.out.println(div);
        while(x > 0){
            if(x /div != x % 10){
                return false;
            }
            x = x % div /10;
            div/=100;
            System.out.println(x);
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome(3523));
    }

}
