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

    public static ListNode[] splitListToParts(ListNode root, int k) {
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
                node = new ListNode(curr.val);
                retArr[j] = node;
                index--;
                if(index == 0) {
                    node.next = null;
                    j++;
                    if(j<list.size()){
                        index = list.get(j);
                    }
                }
            } else if(0 == index){
                node.next = null;
                j++;
                index = list.get(j);
                node = new ListNode(curr.val);
                retArr[j] = node;
                index--;
            }
            else {
                index--;
                node.next =  new ListNode(curr.val);
                node = node.next;
            }
            curr = curr.next;
        }
        return retArr;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
       /* ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);

        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(7);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = null;*/

       head.next = null;

        ListNode[] arr = splitListToParts(head,1);
        System.out.println("end");

    }


}
