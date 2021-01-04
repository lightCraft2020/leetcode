package jan;

/**
 * Created By think
 * Created At 2021/1/4 22:17
 */
public class DeleteNodeOffer18 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public static ListNode deleteNode(ListNode head, int val) {
        ListNode node = head;
        if(head.val == val){
            return head.next;
        }
        while(head.next != null){
            if(head.next.val == val){
                head.next = head.next.next;
                return node;
            } else {
                head = head.next;
            }
        }
        if(head.val == val){
            head = null;
        }
        return node;
    }
}
