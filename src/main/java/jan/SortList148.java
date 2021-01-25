package jan;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created By think
 * Created At 2021/1/25 22:54
 */
public class SortList148 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public static ListNode sortList(ListNode head) {
        if(head == null){
            return head;
        }
        List<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        Integer[] arr = list.toArray(new Integer[list.size()]);
        ListNode curr = new ListNode(0);
        ListNode dummy = curr;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            curr.next = node;
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(6);
        ListNode head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        head = sortList(head);
        System.out.println(head);





    }




}
