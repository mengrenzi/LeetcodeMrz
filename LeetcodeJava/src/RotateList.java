import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 1:05 2018/10/19
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution061 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        int length = 1;
        ListNode pre = new ListNode ( 0 );
        pre.next = head;
        ListNode fast = head;
        ListNode slow = head;

        while(slow.next != null){
            slow = slow.next;
            length++;
        }

        slow.next = head;
        k = k % length;
        k = length - k;
        slow = pre;

        for(int i = 0; i< k; i++) {
            slow = slow.next;
        }

        fast = slow.next;
        slow.next = null;

        return fast;
    }

    public static void main(String[] args) {
        Solution061 mysolution = new Solution061 ();
        ListNode head = new ListNode ( 1 );
        ListNode x = head;
        x.next = new ListNode ( 2 );
        x = x.next;
        x.next = new ListNode ( 3 );
        x = x.next;
        x.next = new ListNode ( 4 );
        x = x.next;
        x.next = new ListNode ( 5 );

        System.out.println ( mysolution.rotateRight ( head,2 ).val);
    }


}

public class RotateList {
}
