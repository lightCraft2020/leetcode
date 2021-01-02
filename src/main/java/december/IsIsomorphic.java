package december;

import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic {

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        if (isNotSame( sArr, tArr) || isNotSame( tArr, sArr)) return false;

        return true;
    }

    private static boolean isNotSame(char[] sArr, char[] tArr) {
        Map<Character,Character> map= new HashMap<>();
        for (int i = 0; i < sArr.length; i++) {
            Character cs = sArr[i];
            Character ct = tArr[i];
            if(map.containsKey(cs)){
                if(!ct.equals(map.get(cs))){
                    return true;
                }
            } else{
                map.put(cs,ct);
            }
        }
        return false;
    }


    public static void main(String[] args) {

        System.out.println(isIsomorphic("paper","title"));

    }


}
