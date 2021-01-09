package jan;

/**
 * Created By think
 * Created At 2021/1/9 23:21
 */
public class IntersectionNode160 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(null == headA || null == headB){
            return  null;
        }
        ListNode ra = reverseList(headA);
        ListNode rb = reverseList(headB);


        if(ra != rb){
            headA = reverseList(ra);
            headB = reverseList(rb);
            return null;
        }

        if(ra.next ==null || rb.next == null){
            ListNode ret = ra;
            headA = reverseList(ra);
            headB = reverseList(rb);
            return ret;
        }

        ListNode common = null;
        while (ra.next != null && rb.next != null){
            if(ra.next == rb.next){
                ra = ra.next;
                rb = rb.next;
            } else {
                break;
            }
        }
        common = ra;

        while (ra.next != null){
            ra = ra.next;
        }
        while (rb.next != null){
            rb = rb.next;
        }
        headB = rb;
        headA = ra;
        return common;
    }

    private ListNode reverseList(ListNode node){
        ListNode pre = null;
        while(node != null){
            ListNode next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }





}
