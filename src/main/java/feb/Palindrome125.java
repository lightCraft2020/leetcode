package feb;

/**
 * Created By think
 * Created At 2021/2/24 21:32
 */
public class Palindrome125 {

    public static boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
            char c = str.charAt(i);
            if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')){
                sb.append(c);
            }
        }
        String ret = sb.toString();
        String ret1 = sb.reverse().toString();
        return ret1.equals(ret);
    }

    public static void main(String[] args) {
        //System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("0P"));
    }


}
