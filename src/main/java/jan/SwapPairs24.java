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
            ListNode temp = curr.next.next;
            temp.next = curr.next;
            curr.next = curr.next.next;

            curr = curr.next;
        }



        return dummy.next;
    }




}
