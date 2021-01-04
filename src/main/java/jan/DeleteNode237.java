package jan;

/**
 * Created By think
 * Created At 2021/1/4 22:46
 */
public class DeleteNode237 {

    public static class ListNode {
        int val;
        DeleteNodeOffer18.ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
