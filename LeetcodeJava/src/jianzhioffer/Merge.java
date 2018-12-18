package jianzhioffer;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 17:34 2018/12/16
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class Merge {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode res = new ListNode ( 0 );
        if(list1 == null && list2 == null)
            return null;
        while(list1 != null || list2 != null) {
            if(list1 == null) {
                res.next = list2;
            }

            if(list2 == null) {
                res.next = list1;
            }

            if(list1.val > list2.val){
                res.val = list2.val;
                list2 =  list2.next;
            }else {
                res.val = list1.val;
                list1 =  list1.next;
            }

            res.next = new ListNode ( 0 );
        }

        return res;
    }
}
