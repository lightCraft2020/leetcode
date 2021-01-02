package december;

public class LengthOfLastWord58 {

    public static int lengthOfLastWord(String s) {
        if(null == s || s.length() == 0){
            return 0;
        }
        String[] arr = s.split("\\s+");
        if(arr.length == 0){
            return 0;
        }
        return arr[arr.length - 1].length();
    }

    public static void main(String[] args) {

        System.out.println(lengthOfLastWord(" "));
    }
}
