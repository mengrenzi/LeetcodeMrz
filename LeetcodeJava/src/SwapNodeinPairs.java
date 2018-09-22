/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 18:29 2018/9/22
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution024{
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode swapPairs(ListNode head) {
        ListNode result = new ListNode ( 0 );
        result.next = head;
        ListNode current = result;
        help(current);
        return result.next;
    }

    private void help(ListNode pre){
        if(pre.next == null || pre.next.next == null){
            return;
        }

        ListNode dummy = pre.next;
        pre.next = dummy.next;
        dummy.next = dummy.next.next;
        pre.next.next = dummy;

        help ( dummy );
    }

}

public class SwapNodeinPairs {


}
