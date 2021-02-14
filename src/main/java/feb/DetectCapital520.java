package feb;

/**
 * Created By think
 * Created At 2021/2/14 23:52
 */
public class DetectCapital520 {

    public static boolean detectCapitalUse(String word) {
        boolean ret = false;
        if(isAllCapital(word) || isAllLower(word) || isFirstCapital(word)){
            return true;
        }
        return ret;
    }

    private static boolean isAllCapital(String word){
        boolean ret = true;
        char[] arr = word.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 'A' || arr[i] > 'Z'){
                ret = false;
                break;
            }
        }
        return ret;
    }
    private static boolean isAllLower(String word){
        boolean ret = true;
        char[] arr = word.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 'a' || arr[i] > 'z'){
                ret = false;
                break;
            }
        }
        return ret;
    }

    private static boolean isFirstCapital(String word){
        boolean ret = true;
        char[] arr = word.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(i == 0 && (arr[i] < 'A' || arr[i] > 'Z')){
                ret = false;
                break;
            }
            if((i > 0) && (arr[i] < 'a' || arr[i] > 'z')){
                ret = false;
                break;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("Leetcode"));
    }
}
