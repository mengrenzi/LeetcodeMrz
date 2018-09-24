/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 10:31 2018/9/24
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */


class Solution025 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode result = new ListNode ( 0 );
        if(head == null){
            return null;
        }
        result.next = head;
        ListNode dummy = result;
        ListNode slow = head;
        ListNode fast = head;
        ListNode after = head;

        while(true){
            for(int i = 0; i< k; i++){
                if(after == null){
                    return result.next;
                }
                after = after.next;
            }

            for(int i = 0; i< k - 1; i++){
                fast = slow.next;
                slow.next = fast.next;
                fast.next = dummy.next;
                dummy.next = fast;
            }

            dummy = slow;
            slow =after;
        }
    }
}

public class ReverseNodesinKGroup {
    public static void main(String[] args) {
        Solution025 mysolution = new Solution025 ();
        ListNode mynode = new ListNode ( 1 );
        ListNode head = mynode;
        for(int i = 2; i< 6; i++ ){
            ListNode next = new ListNode ( i );
            mynode.next = next;
            mynode = next;
        }
        ListNode ans = mysolution.reverseKGroup ( head, 2 );
        for(int i = 0; i< 5; i++){
            System.out.println ( ans.val );
            ans = ans.next;
        }
    }
}
