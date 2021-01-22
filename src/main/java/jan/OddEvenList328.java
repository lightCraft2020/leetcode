package jan;

/**
 * Created By think
 * Created At 2021/1/22 22:38
 */
public class OddEvenList328 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public static ListNode oddEvenList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode curr = new ListNode(0);
        curr.next = head;
        ListNode oddNode = new ListNode(0);
        ListNode dummy = oddNode;
        ListNode evenNode = new ListNode(0);
        ListNode evenHead = evenNode;
        int i = 0;
        while(curr.next != null){
            if(i % 2 == 0){
                oddNode.next = curr.next;
                oddNode = oddNode.next;
            } else {
                evenNode.next = curr.next;
                evenNode = evenNode.next;
            }
            curr = curr.next;
            i++;
        }

        if(i % 2 == 1){
            evenNode.next = null;
        } else {
            oddNode.next = null;
        }
        oddNode.next = evenHead.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;

        ListNode node =  oddEvenList(head);
        System.out.println(node);
    }

}
