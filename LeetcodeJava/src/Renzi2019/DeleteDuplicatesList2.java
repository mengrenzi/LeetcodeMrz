package Renzi2019;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 11:49 2018/12/25
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class DeleteDuplicatesList2 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {return head;}

        ListNode cur = head;
        ListNode root = new ListNode ( 0 );
        ListNode pre = root;
        root.next = head;

        while(cur != null) {
            while(cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
            }
            if(pre.next == cur) {
                pre = pre.next;
            }else {
                pre.next = cur.next;
            }
            cur = cur.next;
        }

        return root.next;
    }
}
