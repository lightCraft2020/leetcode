package jan;

import java.util.HashSet;
import java.util.Set;

/**
 * Created By think
 * Created At 2021/1/16 23:52
 */
public class NumComponents817 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public int numComponents(ListNode head, int[] G) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < G.length; i++) {
            set.add(G[i]);
        }
        if(G.length == 0){
            return 0;
        }
        int count = 0;
        boolean stop = false;
        while(head != null){
            if(set.contains(head.val)){
                stop = true;
            } else {
                if(stop){
                    count++;
                }
                stop=false;
            }
            head = head.next;
        }
        if(stop)
            count++;
        return count;
    }


}
