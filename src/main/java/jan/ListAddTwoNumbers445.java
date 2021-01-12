package jan;

import java.util.Stack;

/**
 * Created By think
 * Created At 2021/1/12 23:09
 */
public class ListAddTwoNumbers445 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1= new Stack<>();
        Stack<Integer> s2= new Stack<>();
        while(l1 != null){
            s1.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            s2.push(l2.val);
            l2 = l2.next;
        }

        int i = 0;
        ListNode pre = null;
        while(!s1.isEmpty() || !s2.isEmpty()){
            int val1 = s1.isEmpty()? 0 : s1.pop();
            int val2 = s2.isEmpty()? 0 : s2.pop();
            int temp = val1 + val2 + i;
            i = temp / 10;
            temp = temp % 10;
            ListNode t = new ListNode(temp);
            t.next = pre;
            pre = t;
        }
        if(i > 0){
            ListNode t = new ListNode(i);
            t.next = pre;
            pre = t;
        }

        return pre;
    }



        /**
         * 不对，需测试验证
         * @param l1
         * @param l2
         * @return
         */
    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode n1 = reverseList(l1);
        ListNode n2 = reverseList(l2);
        int i = 0;
        while (n1 != null && n2 != null){
            int temp = n1.val+n2.val+i;
            i = temp / 10;
            ListNode node = new ListNode(temp%10);
            head.next = node;
            head = head.next;
        }
        while(n1 != null){
            int temp = n1.val+i;
            i = temp / 10;
            ListNode node = new ListNode(temp%10);
            head.next = node;
            head = head.next;
        }
        while(n2 != null){
            int temp = n2.val+i;
            i = temp / 10;
            ListNode node = new ListNode(temp%10);
            head.next = node;
            head = head.next;
        }
        return reverseList(head.next);
    }

    private static ListNode reverseList(ListNode head){
        ListNode pre = null, curr = head;
        while(curr != null){
            ListNode nextTemp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nextTemp;
        }
        return pre;
    }




}
