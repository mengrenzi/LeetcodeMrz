/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 13:57 2018/9/13
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sentinel = new ListNode(0);
        ListNode d = sentinel;
        ListNode pre = sentinel;
        while (l1 != null || l2 != null) {
            pre = d;
            if( l1 != null){
                d.val += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                d.val += l2.val;
                l2 = l2.next;
            }

            d.next = new ListNode(0);
            if(d.val >= 10){
                d.val = d.val % 10;
                d.next.val = 1;
            }
            d = d.next;
        }
        if(d.val == 0) pre.next = null;
        return sentinel;
    }
}



public class addtwoNum {
}
