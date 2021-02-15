package feb;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By think
 * Created At 2021/2/15 22:57
 */
public class FindTheDifference389 {

    public char findTheDifference(String s, String t) {
        if(s == ""){
            return t.toCharArray()[0];
        }
        Map<Character, Integer> countMap = getCountMap(s);
        Map<Character, Integer> countMapTwo = getCountMap(t);
        for (Character c: countMapTwo.keySet()
             ) {
            if(null == countMap.get(c) || countMap.get(c) != countMapTwo.get(c)){
                return c;
            }
        }
        return ' ';
    }

    private Map<Character, Integer> getCountMap(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if(countMap.containsKey(arr[i])){
                count = countMap.get(arr[i])+1;
            }
            countMap.put(arr[i], count);
        }
        return countMap;
    }
}
