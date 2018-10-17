/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 22:05 2018/10/17
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution083 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){ return head;}
        ListNode curr = head;
        ListNode next = head.next;
        while(next.next != null){
            if(next.val == curr.val){
                next = next.next;
                curr.next = next;
            }else{
                curr = curr.next;
                next = curr.next;
            }
        }
        return head;
    }
}

public class RemoveDuplicatesfromSortedList {
}
