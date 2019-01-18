package Renzi2019;

import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 16:22 2019/1/17
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = new ListNode ( 0 );
        cur.next = head;
        ListNode fast = cur;
        ListNode ans = cur;
        if(head == null) return null;
        while(n > 0) {
            if(fast == null) return head;
            fast = fast.next;
            n--;
        }

        while(fast.next != null) {
            fast = fast.next;
            cur = cur.next;
        }

        cur.next = cur.next.next;
        return ans.next;
    }
}
