package jan;

/**
 * Created By think
 * Created At 2021/1/8 23:00
 */
public class MiddleNode876 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode  slow = head;
        while (head.next != null && fast != null && fast.next != null){
            slow = head.next;
            fast = fast.next.next;
            head = head.next;
        }
        return slow;
    }

}
