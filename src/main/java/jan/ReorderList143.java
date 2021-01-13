package jan;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By think
 * Created At 2021/1/13 23:11
 */
public class ReorderList143 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public void reorderList(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        while(head != null){
            list.add(head);
            head = head.next;
        }
        if(list.size() >0){
        int i = 0, j = list.size() -1;
        while(i < j){
            list.get(i).next = list.get(j);
            i++;
            if(i >= j){
                break;
            }
            list.get(j).next = list.get(i);
            j--;
        }
        list.get(i).next = null;
        }
    }

}
