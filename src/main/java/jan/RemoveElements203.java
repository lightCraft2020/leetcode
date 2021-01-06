package jan;

/**
 * Created By think
 * Created At 2021/1/6 22:42
 */
public class RemoveElements203 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        if(head.next == null){
            if(head.val == val){
                return null;
            }
            return head;
        }
        if(head.val == val){
            head = head.next;
            while ((head != null) && (head.val == val)){
                head = head.next;
            }
            if(head != null){
                ListNode prev = iterNode(head, val);
                return prev;
            } else{
                return null;
            }
        } else {
            ListNode prev = iterNode(head, val);
            return prev;
        }
    }

    private ListNode iterNode(ListNode head, int val) {
        ListNode prev = head;
        while (head.next != null) {
            if (head.next.val == val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return prev;
    }


    public static void main(String[] args) {

    }


}
