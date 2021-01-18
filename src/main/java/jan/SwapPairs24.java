package jan;

/**
 * Created By think
 * Created At 2021/1/17 23:37
 */
public class SwapPairs24 {


    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        if(head == null  ||  head.next == null){
            return head;
        }
        while(curr.next != null && curr.next.next != null){
            ListNode node2 = curr.next.next;
            ListNode node1 = curr.next;
            curr.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            curr = node1;
        }
        return dummy.next;
    }




}
