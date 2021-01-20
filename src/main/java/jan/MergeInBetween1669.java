package jan;

/**
 * Created By think
 * Created At 2021/1/20 21:52
 */
public class MergeInBetween1669 {


    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode dummy = new ListNode(0);
        dummy.next = list1;
        ListNode curr = dummy;
        int i = 0;
        while(curr.next != null){
            if(a == i){
                ListNode newCurr = curr.next;
                curr.next = list2;
                while(curr.next != null){
                    curr = curr.next;
                }
                while(newCurr.next != null){
                    if(b == newCurr.val){
                        curr.next = newCurr.next;
                        curr = curr.next;
                        while(curr.next != null){
                            curr = curr.next;
                        }
                        break;
                    }
                    newCurr = newCurr.next;
                }
            } else {
                i++;
                curr = curr.next;
            }
        }
        return dummy.next;
    }

}
