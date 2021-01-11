package jan;

/**
 * Created By think
 * Created At 2021/1/11 22:32
 */
public class KthFromEnd {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public static ListNode getKthFromEnd(ListNode head, int k) {
        int n = 0;
        ListNode a = head;
        while(head != null){
            n++;
            head = head.next;
        }
        int j = n-k;
        int i =0;
        ListNode ret = null;
        while(a != null){
            if(i==j){
                ret = a;
            }
            a = a.next;
            i++;
        }
        return ret;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        head.next = node2;
        node2.next = node3;

        ListNode ret = getKthFromEnd(head, 3);

        System.out.println("over");

    }





}
