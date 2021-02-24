package feb;

import java.util.Stack;

/**
 * Created By think
 * Created At 2021/2/24 22:20
 */
public class ReverseVowels345 {
    public static String reverseVowels(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c== 'i' || c == 'o' || c == 'u'||
                    c == 'A' || c == 'E' || c== 'I' || c == 'O' || c == 'U'){
                st.push(c);
                sb.append('a');
            } else {
                sb.append(c);
            }
        }
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if(c == 'a'){
                char cc = st.pop();
                sb.setCharAt(i, cc);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("aA"));
    }


}
