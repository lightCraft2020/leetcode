package jan;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created By think
 * Created At 2021/1/19 23:41
 */
public class AddTwoNumbers2 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public static ListNode  addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> stack1 = new ArrayList<Integer>();
        List<Integer> stack2 = new ArrayList<Integer>();
        while(l1 != null){
            stack1.add(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            stack2.add(l2.val);
            l2 = l2.next;
        }
        int i = 0;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;


        int max = Math.max(stack1.size(),stack2.size());
        for (int j = 0; j <max ; j++) {
            int s1 = j >= stack1.size()? 0 : stack1.get(j);
            int s2 = j >= stack2.size()? 0 : stack2.get(j);
            int sum = i + s1 + s2;
            i = sum /10;
            int val = sum % 10;
            ListNode node = new ListNode(val);
            curr.next = node;
            curr = curr.next;
        }

        if(i > 0){
            ListNode node = new ListNode(i);
            curr.next = node;
            curr = curr.next;
        }

        return dummy.next;
    }

    public static ListNode  addTwoNumbers1(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        while(l1 != null){
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            stack2.push(l2.val);
            l2 = l2.next;
        }
        int i = 0;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(!stack1.isEmpty() || !stack2.isEmpty()){
            int s1 = stack1.isEmpty()? 0 : stack1.pop();
            int s2 = stack2.isEmpty()? 0 : stack2.pop();
            int sum = i + s1 + s2;
            i = sum /10;
            int val = sum % 10;
            ListNode node = new ListNode(val);
            curr.next = node;
            curr = curr.next;
        }
        if(i > 0){
            ListNode node = new ListNode(i);
            curr.next = node;
            curr = curr.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        ListNode l13 = new ListNode(3);
        l1.next = l12;
        l12.next = l13;

        ListNode l2 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        ListNode l23 = new ListNode(4);
        l2.next = l22;
        l22.next = l23;

        ListNode result = addTwoNumbers(l1,l2);
        System.out.println("over");

    }


}
