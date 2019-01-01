package Renzi2019;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 15:26 2018/12/27
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode ( 0 );
        ListNode root = l3;

        while(l1 != null || l2 != null) {
            if(l1 == null) {
                l3.next = l2;
                break;
            }
            if(l2 == null) {
                l3.next = l1;
                break;
            }

            if(l1.val > l2.val) {
                l3.next = new ListNode ( l2.val );
                l2 = l2.next;
                l3 = l3.next;
            } else {
                l3.next = new ListNode ( l1.val );
                l1 = l1.next;
                l3 = l3.next;
            }
        }

        return root.next;
    }
}
