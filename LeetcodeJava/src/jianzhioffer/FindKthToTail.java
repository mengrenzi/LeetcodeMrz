package jianzhioffer;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 11:28 2018/12/16
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head, int k) {

        int length = 0;
        ListNode l1 = head;

        while(l1.next != null) {
            l1 = l1.next;
            length++;
        }

        for(int i = 0; i< length - k; i++) {
            head = head.next;
        }

        return head;
    }
}
