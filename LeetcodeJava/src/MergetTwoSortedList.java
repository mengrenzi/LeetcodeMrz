/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 15:55 2018/9/20
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */


class Solution021 {

    public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode result = head;
        while(l1 != null || l2 != null){

            if(l1 == null){
                result.next = l2;
                break;
            }

            if(l2 == null){
                result.next = l1;
                break;
            }

            if(l1.val < l2.val){
                result.next = l1;
                l1 = l1.next;
            }else{
                result.next = l2;
                l2 = l2.next;
            }

        }
        return head.next;
    }
}


public class MergetTwoSortedList {

}