package jan;

import java.util.HashSet;
import java.util.Set;

/**
 * Created By think
 * Created At 2021/1/23 23:53
 */
public class RemoveDuplicateNodes {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public static ListNode removeDuplicateNodes(ListNode head) {
        Set<Integer> set = new HashSet<Integer>();
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while(curr.next != null && curr.next.next != null){
            if(set.contains(curr.next.val) ){
                while(curr.next!= null && set.contains(curr.next.val) && curr.next.next != null){
                    ListNode temp = curr.next.next;
                    curr.next = temp;
                }
            } else {
                set.add(curr.next.val);
                curr = curr.next;
            }
        }
        if(curr.next != null && set.contains(curr.next.val) ) {
            curr.next = null;
        }
        return dummy.next;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(1);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;
        ListNode node = removeDuplicateNodes(head);
        System.out.println(node);
    }



}
