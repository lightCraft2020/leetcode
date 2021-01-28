package jan;

/**
 * Created By think
 * Created At 2021/1/28 21:50
 */
public class RemoveNthFromEnd19 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;  //*****
        ListNode node = head;
        int count = 0;
        while(node.next != null){
            if(count > n-2){
                curr = curr.next;
            }
            node = node.next;
            count++;
        }
        curr.next = curr.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        head.next = node2;
        node2.next = node3;
        node3.next = null;
        ListNode next = removeNthFromEnd(head,3);
        System.out.println(next);

    }



}
