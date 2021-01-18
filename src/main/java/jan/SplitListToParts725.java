package jan;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By think
 * Created At 2021/1/18 22:36
 */
public class SplitListToParts725 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode[] splitListToParts(ListNode root, int k) {

        ListNode dummy = new ListNode(0);
        ListNode head = root;
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }

        List<Integer> list = new ArrayList<>();
        int n = count / k;
        int left = count - n*k;
        for (int i = 0; i < left; i++) {
            list.add(n+1);
        }
        for (int i = 0; i < k - left; i++) {
            list.add(n);
        }

        ListNode[] retArr = new ListNode[k];
        int j = 0;
        int index =list.get(j);
        ListNode curr = root;
        ListNode node = curr;
        while(curr != null){
            if(index == list.get(j)){
                ListNode newNode = curr;
                node = curr;
                retArr[j] = newNode;
            } else if(index == 0){
                node.next = null;
                j++;
                index =list.get(j);
            } else {
                index--;
                node.next = curr;
            }
            curr = curr.next;
        }
        return retArr;
    }


}
