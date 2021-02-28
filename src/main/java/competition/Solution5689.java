package competition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created By think
 * Created At 2021/2/28 10:43
 */
public class Solution5689 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int counter = 0;
        for (List<String> list : items) {
            if(ruleValue.equals(list.get(getIndexByKey(ruleKey)))){
                counter++;
            }
        }
        return counter;
    }

    private int getIndexByKey(String ruleKey){
        int index = -1;
        switch(ruleKey){
            case "type":
                index = 0;
                break;
            case "color":
                index = 1;
                break;
            case "name":
                index = 2;
                break;
        }
        return index;
    }

    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        List<String> one = Arrays.asList("phone","blue","pixel");
        items.add(one);
        List<String> two = Arrays.asList("computer","silver","lenovo");
        items.add(two);
        List<String> three = Arrays.asList("phone","gold","iphone");
        items.add(three);
        Solution5689 app = new Solution5689();
        String ruleKey = "color", ruleValue = "silver";
        System.out.println(app.countMatches(items, ruleKey, ruleValue));
    }



}
