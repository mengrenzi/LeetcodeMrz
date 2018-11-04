/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 18:01 2018/11/2
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution082 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;

        ListNode preNode, curNode, realNode;
        ListNode dummy = new ListNode ( 0 );
        realNode = dummy;
        preNode = dummy;
        curNode = head;

        while(curNode != null) {
            if(( preNode == dummy || curNode.val != preNode.val)
                    && ((curNode.next == null) || (curNode.val != curNode.next.val))) {
                realNode.next = curNode;
                realNode = curNode;
            }
            preNode = preNode.next;
            curNode = curNode.next;
            preNode.next = null;
        }

        return dummy.next;
    }
}

public class RemoveDuplicatesfromSortedList2 {
}
