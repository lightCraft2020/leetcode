package jan;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By think
 * Created At 2021/1/21 22:08
 */
public class RotateRight61 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        ListNode dummy  = new ListNode(0);
        int n = 0;
        ListNode node = head;
        List<ListNode> list = new ArrayList<>();
        while(node != null){
            ListNode newNode = new ListNode(node.val);
            list.add(newNode);
            node = node.next;
            n++;
        }
        if(0 == n){
           return head;
        }
        k = k % n;
        int j = n - k;
        ListNode curr = dummy;
        for (int i = j; i <j + n ; i++) {
            int m = i % n;
            curr.next = list.get(m);
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
  /*      ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(7);*/
        head.next = node1;
        node1.next = node2;
        node2.next = null;
       /* node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = null;*/

       ListNode node =  rotateRight(head, 3);
        System.out.println(node);

    }



}
