package Renzi2019;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 11:50 2018/12/26
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cur = new ListNode ( 0 );
        ListNode root = cur;
        int sum = 0;

        while(l1 != null || l2 != null) {
            sum = sum / 10;
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            cur.next = new ListNode ( sum % 10 );
            cur = cur.next;
        }

        if(sum / 10 != 0) {
            cur.next = new ListNode ( sum / 10 );
        }

        return root.next;
    }
}
