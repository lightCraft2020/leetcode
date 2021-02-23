package feb;

import java.util.Stack;

/**
 * Created By think
 * Created At 2021/2/23 22:55
 */
public class AddStrings415 {

    public static String addStrings(String num1, String num2) {
        char[] c1 = num1.toCharArray();
        char[] c2 = num2.toCharArray();
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        Stack<Integer> r = new Stack<>();
        for (int i = 0; i < c1.length ; i++) {
            s1.push(c1[i]);
        }
        for (int i = 0; i < c2.length ; i++) {
            s2.push(c2[i]);
        }
        int sum = 0;
        while((!s1.isEmpty()) || (! s2.empty())){
            int n1 = s1.isEmpty() ? 0 : Integer.valueOf(s1.pop().toString());
            int n2 = s2.isEmpty() ? 0 : Integer.valueOf(s2.pop().toString());
            sum += n1 + n2;
            int s = sum % 10;
            sum = sum / 10;
            r.push(s);
        }
        if(sum > 0){
            r.push(sum);
        }
        StringBuilder sb = new StringBuilder();
        while(!r.isEmpty()){
            sb.append(r.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(addStrings("9","99"));
    }


}
