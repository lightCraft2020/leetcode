package december;

import java.util.Stack;

public class ValidParentheses20 {


    public static boolean isValidBetter(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(Character c : s.toCharArray()){
            if(c == '('){
                stack.push(')');
            } else if('{' == c){
                stack.push('}');
            } else if('[' == c){
                stack.push(']');
            } else if(stack.isEmpty() || c != stack.pop()){
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static boolean isValid(String s) {
        while(s.contains("{}") || s.contains("[]") || s.contains("()")){
            s = s.replaceAll("\\{\\}","");
            s = s.replaceAll("\\[\\]","");
            s = s.replaceAll("\\(\\)", "");
        }
        return "".equals(s) ? true: false;
    }


    public static void main(String[] args) {

        System.out.println(isValidBetter("()[]{}"));

    }
}
