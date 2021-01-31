package jan;

/**
 * Created By think
 * Created At 2021/1/31 23:23
 */
public class TestNode {
    
    
    public static ListNode getNode(){
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        return head;
    }


   
}
