package december;


/**
 * 100%
 */
public class RemoveDuplicates83 {

    public ListNode deleteDuplicates(ListNode head) {
        if(null == head || head.next == null){
            return head;
        }
        ListNode newHead = head;
        ListNode next = head.next;
        while (null != next){
            if(newHead.val == next.val){
                newHead.next = next.next;
            } else {
                newHead = newHead.next;
            }
            next = newHead.next;
        }
        return head;
    }


    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {

    }
}
