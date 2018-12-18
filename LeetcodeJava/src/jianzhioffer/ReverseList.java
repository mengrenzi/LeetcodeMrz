package jianzhioffer;

import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 15:37 2018/12/16
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode pre = head;
        ListNode cur = head;
        ListNode next;

        while(cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        head.next = null;


        return cur;
    }
}
