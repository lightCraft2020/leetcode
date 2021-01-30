package jan;

/**
 * Created By think
 * Created At 2021/1/31 0:17
 */
public class ReverseBetween92 {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode reverse = null;
        ListNode curr = head;
        int i = 1;
        ListNode dummy = new ListNode(0);
        dummy.next = curr;
        if(null == head || m==n){
            return head;
        }
        ListNode pre = null;
        while(curr != null){
            if(i == m){
                pre = curr;
                reverse = curr;
                curr = curr.next;
                reverse.next = reverse;
            } else if(n == i){
                reverse = reverseList(reverse);
                reverse.next = curr;
            }
            else {
                curr = curr.next;
            }
            i++;
        }
        return dummy.next;
    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;
    }


}
