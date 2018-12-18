package jianzhioffer;

import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 17:34 2018/12/16
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class Merge {
    public static ListNode Merge(ListNode list1, ListNode list2) {
        ListNode res = new ListNode ( 0 );
        ListNode root = res;
        if(list1 == null && list2 == null) return null;

        while(list1 != null || list2 != null) {
            if(list1 == null) {
                res.next = list2;
                break;
            }

            if(list2 == null) {
                res.next = list1;
                break;
            }

            if(list1.val > list2.val){
                res.next = new ListNode ( list2.val );
                list2 =  list2.next;
            }else {
                res.next = new ListNode ( list1.val );
                list1 =  list1.next;
            }
            res = res.next;
        }
        return root.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode ( 1 );
        l1 = l1.next;
        l1 = new ListNode ( 3 );
        l1 = l1.next;
        l1 = new ListNode ( 5 );

        ListNode l2 = new ListNode ( 2 );
        l2 = l2.next;
        l2 = new ListNode ( 4 );
        l2 = l2.next;
        l2 = new ListNode ( 6 );

        ListNode l3 = Merge.Merge(l1, l2);

        while(l3 != null) {
            System.out.println ( l3.val );
            l3 = l3.next;
        }
    }
}
