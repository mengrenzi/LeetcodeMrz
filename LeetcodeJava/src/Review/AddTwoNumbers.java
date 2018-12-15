package Review;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 16:03 2018/12/14
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */


public class AddTwoNumbers {

}

class Solution002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode ( 0 );
        ListNode res = root;

        while(l1 != null || l2 != null) {
            res = new ListNode ( 0 );
            if(l1 != null) {
                res.val += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                res.val += l2.val;
                l2 = l2.next;
            }

            res = res.next;
        }

        return root;
    }
}
