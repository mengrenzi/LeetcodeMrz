/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 8:26 2018/9/19
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class ListNode {
    int val;
    Solution018.ListNode next;
    ListNode(int x) { val = x; }
};

class Solution018 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        for(int i = 0; i < n; i++){
            fast = fast.next;
        }

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}
