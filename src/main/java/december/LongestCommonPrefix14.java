package december;

public class LongestCommonPrefix14 {

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }

        for (int i = 0; i < strs.length-1; i++) {
            if(strs[i].toCharArray().length < strs[i+1].toCharArray().length){
                String temp = strs[i];
                strs[i] = strs[i+1];
                strs[i+1] = temp;
            }
        }
        String min = strs[strs.length-1];
        for (int i = 0; i <min.toCharArray().length ; i++) {
            String ret = min.substring(0,i+1);
            for (int j = 0; j < strs.length - 1; j++) {
                if(!strs[j].startsWith(ret)){
                    return min.substring(0,i);
                }
            }
        }
        return min ;
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));

    }
    

}
