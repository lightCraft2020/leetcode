package feb;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By think
 * Created At 2021/2/25 21:47
 */
public class RansomNote383 {

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        int n = magazine.length();
        for (int i = 0; i < n; i++) {
            Character c = magazine.charAt(i);
            Integer count = 0;
            if(map.containsKey(c)){
                count = map.get(c);
            }
            map.put(c, count +1);
        }
        int total = ransomNote.length();
        for (int i = 0; i < total; i++) {
            Character c = ransomNote.charAt(i);
            if(!map.containsKey(c)){
                return false;
            } else {
                int count = map.get(c);
                if(count == 0){
                    return false;
                }
                map.put(c, count-1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aa","aab"));
    }
}
