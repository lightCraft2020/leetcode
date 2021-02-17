package feb;

import java.util.Arrays;

/**
 * Created By think
 * Created At 2021/2/17 23:33
 */
public class IsAnagram242 {

    public static boolean isAnagram(String s, String t) {
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();
        Arrays.sort(arrS);
        Arrays.sort(arrT);
        s= String.valueOf(arrS);
        t = String.valueOf(arrT);
        return s.equals(t);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }


}
