package december;

import java.util.Stack;

public class AddBinary67 {

    public static String addBinary(String a, String b) {

        int c1 = a.length();
        int c2 = b.length();
        int max = Math.max(c1, c2);

       Stack<Character> s1 = new Stack<>();
       Stack<Character> s2 = new Stack<>();
       Stack<String> s = new Stack<>();

        for (int i = 0; i <a.length() ; i++) {
            s1.push(a.charAt(i));
        }
        for (int i = 0; i <b.length() ; i++) {
            s2.push(b.charAt(i));
        }

        Integer m = 0;
        for (int i = 0; i < max; i++) {
            Integer curr = m;
            if(i < c1){
                Character p = s1.pop();
                int pp = Integer.valueOf(p.toString());
                curr+=pp;
            }

            if(i < c2){
                Character q = s2.pop();
                int qq = Integer.valueOf(q.toString());
                curr+=qq;
            }

            if(curr>=2){
                m=1;
                curr-=2;
            } else{
                m=0;
            }
           s.add(curr.toString());
        }

        StringBuffer sb = new StringBuffer();
        while(!s.isEmpty()){
            String str = s.pop();
            sb.append(str);
        }
        if(m>0){
            return  m+sb.toString();
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String a = "11";
        String b="1";
        System.out.println(addBinary(a,b));
    }
}
