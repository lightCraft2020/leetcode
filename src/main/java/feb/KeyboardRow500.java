package feb;

import java.util.*;

/**
 * Created By think
 * Created At 2021/2/20 23:56
 */
public class KeyboardRow500 {


    public String[] findWords(String[] words) {

        Set<Character> setOne = getSet("qwertyuiop");
        Set<Character> setTwo = getSet("asdfghjkl");
        Set<Character> setThree = getSet("zxcvbnm");

        List<String> list = new ArrayList<>();

        for(String word : words){
            if(contains(setOne, word) ||
                    contains(setTwo, word) ||contains(setThree, word)){
                list.add(word);
            }
        }
        return list.toArray(new String[list.size()]);
    }

    private boolean contains(Set<Character> set, String word){
        for(char c : word.toLowerCase().toCharArray()){
            if(!set.contains(c)){
                return false;
            }
        }
        return true;
    }

    private Set<Character> getSet(String strs){
        Set<Character> set = new HashSet<>();
        for(char item : strs.toCharArray()){
            set.add(item);
        }
        return set;
    }
}
