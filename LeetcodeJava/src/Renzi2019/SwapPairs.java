package Renzi2019;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 15:09 2018/12/31
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class SwapPairs {
}

class Solution24 {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode root = new ListNode ( 0 );
        ListNode pre = head;
        ListNode cur = head.next;
        root.next = cur;
        ListNode after = cur.next;
        while(pre != null && pre.next != null) {
            cur = pre.next;
            after = cur.next;
            cur.next = pre;
            if(after != null && after.next != null) {
                pre.next = after.next;
            } else {
                pre.next = after;
            }
            pre = after;
        }
        return root.next;
    }
}