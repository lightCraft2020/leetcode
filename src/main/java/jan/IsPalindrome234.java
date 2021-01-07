package jan;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created By think
 * Created At 2021/1/7 22:35
 */
public class IsPalindrome234 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        while(head != null){
            list.add(head.val);
            stack.push(head.val);
            head = head.next;
        }
        int n = list.size();
        for (int i = 0; i < n; i++) {
            int a = list.get(i);
            int b = stack.pop();
            if(a != b){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }


}
