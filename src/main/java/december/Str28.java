package december;

import com.sun.javaws.IconUtil;

public class Str28 {



    public static int strStr(String haystack, String needle) {
        if(null == needle || needle.length() == 0 || haystack.equals(needle)){
            return 0;
        }



        char[] a = haystack.toCharArray();
        char[] b = needle.toCharArray();
        boolean ret = false;

        for (int i = 0; i < a.length - b.length +1; i++) {
            for (int k = 0; k <b.length ; k++) {
                if(a[i + k] != b[k]){
                    ret = false;
                 break;
                }
                ret = true;
            }
            if(ret){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String a = "abc";
        String b = "c";
        System.out.println(strStr(a,b));

    }
}
