/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 6:57 2018/10/31
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution092 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if( head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode ( 0 );
        dummy.next = head;
        ListNode pre = dummy;
        ListNode  cur = head, next = head;

        for(int i = 1; i< m; i++) {
            pre = cur;
            cur = cur.next;
        }
        next = cur;
        for(int i = m; i< n; i++) {
            next = next.next;
        }

        while(cur != next) {
            pre.next = cur.next;
            cur.next = next.next;
            next.next = cur;
            cur = pre.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        Solution092 mysolution = new Solution092 ();
        ListNode head = new ListNode ( 1 );
        ListNode temp =head;
        ListNode cur = new ListNode ( 2 );
        head.next = cur;
        head = head.next;
        cur = new ListNode ( 3 );
        head.next = cur;
        head = head.next;
        cur = new ListNode ( 4 );
        head.next = cur;
        head = head.next;
        cur = new ListNode ( 5 );
        head.next = cur;
        head = head.next;

        head = mysolution.reverseBetween ( temp, 2, 4 );
        while(head != null){
            System.out.println ( head.val );
            head = head.next;
        }
    }
}

public class ReverseLinkedList2 {
}

