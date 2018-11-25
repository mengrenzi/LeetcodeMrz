import java.util.LinkedList;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 12:02 2018/11/24
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class LinkedListCycle {
}

class Solution141 {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode fast = head;
        ListNode slow = head;
        while(true) {
            if(fast.next == null || fast.next.next == null) return false;
            if(slow.next == null || slow.next.next == null) return false;
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) return true;
        }
    }
}
