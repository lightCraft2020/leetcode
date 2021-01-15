package jan;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created By think
 * Created At 2021/1/14 21:30
 */
public class DeleteDuplicates82 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicateSet = new HashSet<>();
        ListNode newHead = head;
        while (head != null){
            if(set.contains(head.val)){
                duplicateSet.add(head.val);
            } else {
                set.add(head.val);
            }
            head = head.next;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = newHead;
        ListNode curr = dummy;
        while(curr.next != null && curr.next.next != null){
            ListNode temp = curr.next;
            if(duplicateSet.contains(curr.next.val)){
                while(duplicateSet.contains(curr.next.val)){
                    curr.next = curr.next.next;
                    curr = curr.next;
                }
                temp.next = curr;
            }
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(4);
        ListNode node7 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        deleteDuplicates(node1);

    }
}
