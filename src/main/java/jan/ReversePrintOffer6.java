package jan;

import java.util.Stack;

/**
 * Created By think
 * Created At 2021/1/10 19:53
 */
public class ReversePrintOffer6 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null){
            stack.push(head.val);
            head = head.next;
        }
        int[] arr = new int[stack.size()];
        int i = 0;
        while (!stack.isEmpty()){
            arr[i] = stack.pop();
            i++;
        }
        return arr;
    }

}
