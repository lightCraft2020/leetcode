package jan;

/**
 * Created By think
 * Created At 2021/1/31 0:17
 */
public class ReverseBetween92 {

    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if(null == head || n == 1){
            return head;
        }
        ListNode curr = head, prev = null;
        while(m > 1){
            prev = curr;
            curr = curr.next;
            m--;
            n--;
        }
        ListNode node = prev, tail = curr;
        while (n > 0){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr= temp;
            n--;
        }
        if(node != null){
            node.next = prev;
        } else {
            head = prev;
        }

        tail.next = curr;
        return head;
    }

    public static ListNode reverseBetweenF(ListNode head, int m, int n) {
        ListNode reverse = null;

        int i = 1;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        if(null == head || m==n){
            return head;
        }
        ListNode newHead = null;
        ListNode pre = null;
        while(dummy.next != null){
            if(i == m){
                pre = dummy;
                reverse = new ListNode(dummy.next.val);
                newHead = reverse;
                curr = curr.next;
                dummy = dummy.next;
            } else if(i>m && i <=n){
                reverse.next = new ListNode(dummy.next.val);
                reverse = reverse.next;
                dummy = dummy.next;
            }
            else if(n < i){
                newHead = reverseList(newHead);
                pre.next = newHead;
                while( reverse.next != null){
                    reverse = reverse.next;
                }
                reverse.next = dummy.next;
            }
            else {
                dummy = dummy.next;
            }
            i++;
        }
        return curr.next;
    }

    public static ListNode reverseList(ListNode head) {
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

    public static void main(String[] args) {

        ListNode head = TestNode.getNode();
        head = reverseBetween(head,2,4);
        System.out.println(head);


    }



}
