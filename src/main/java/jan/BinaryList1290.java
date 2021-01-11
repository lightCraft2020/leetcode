package jan;

/**
 * Created By think
 * Created At 2021/1/11 22:20
 */
public class BinaryList1290 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public int getDecimalValue(ListNode head) {
        int total = 0;
        int i = 0;
        ListNode a = head;
        while(head != null){
            i++;
            head = head.next;
        }
        while(a != null){
            total += Math.pow(2, i-1) * a.val;
            a = a.next;
            i--;
        }
        return total;
    }


}
