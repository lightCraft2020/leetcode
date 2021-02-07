package feb;

/**
 * Created By think
 * Created At 2021/2/6 23:40
 */
public class ReverseString344 {

    public static void reverseString(char[] s) {
        if(s.length == 0){
            return;
        }
        int n = s.length / 2;
        for(int i=0; i<n; i++){
            char t = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = t;
        }
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
