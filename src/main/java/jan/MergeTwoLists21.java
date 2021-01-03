package jan;

/**
 * Created By think
 * Created At 2021/1/3 18:40
 */
public class MergeTwoLists21 {

    /**
     * Definition for singly-linked list.
     *
     * */
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode head = dummy;
        while (l1 != null || l2 != null)
        {
            ListNode currNode = null;
            if(l1 == null || ((l2 != null) && (l1.val > l2.val))){
                currNode = new ListNode(l2.val);
                l2=l2.next;
            } else if(l2 == null || ((l1 != null) && (l1.val <= l2.val))){
                currNode = new ListNode(l1.val);
                l1=l1.next;
            }
            head.next = currNode;
            head = head.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        //1->2->4, 1->3->4

        ListNode node11 = new ListNode(1);
        ListNode node12 = new ListNode(2);
        ListNode node13 = new ListNode(4);
        ListNode h1 = node11;
        node11.next = node12;
        node12.next = node13;
/*        while(h1 != null){
            System.out.println(h1.val);
            h1 = h1.next;
        }*/
        //System.out.println("-------------");

        ListNode node21 = new ListNode(1);
        ListNode node22 = new ListNode(3);
        ListNode node23 = new ListNode(4);
        ListNode h2 = node21;
        node21.next = node22;
        node22.next = node23;
/*        while(h2 != null){
            System.out.println(h2.val);
            h2 = h2.next;
        }*/

        ListNode ln = mergeTwoLists(h1, h2);
        System.out.println("-------------");
        while(ln != null){
            System.out.println(ln.val);
            ln = ln.next;
        }

        System.out.println();
    }

}




