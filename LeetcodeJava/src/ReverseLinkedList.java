/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 7:11 2018/10/31
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution206 {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode pre = head;
        ListNode cur = head;
        ListNode next = head;
        cur = cur.next;

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

public class ReverseLinkedList {
}
