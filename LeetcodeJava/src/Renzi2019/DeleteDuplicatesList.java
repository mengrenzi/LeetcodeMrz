package Renzi2019;


/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 11:32 2018/12/25
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class DeleteDuplicatesList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {return head;}

        ListNode x = head;
        x = x.next;
        ListNode pre = head;

        while(x != null) {
            if(x.val != pre.val) {
                pre.next = x;
                pre = pre.next;
            }
            x = x.next;
        }
        pre.next = null;
        return head;
    }
}
