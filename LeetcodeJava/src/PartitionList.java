/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 18:48 2018/11/2
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */


class Solution086 {
    public ListNode partition(ListNode head, int x) {
        if(head == null) return null;
        ListNode dummy = new ListNode ( 0 );
        ListNode cur, pre, left;
        dummy.next = head;
        left = dummy;
        pre = dummy;
        cur = head;

        while(cur != null) {
            if(cur.val < x) {
                if(pre != left){
                    pre.next = cur.next;
                    cur.next = left.next;
                    left.next = cur;
                    left = left.next;
                    cur = pre.next;
                }else {
                    left = left.next;
                    pre = cur;
                    cur = cur.next;
                }
            }else {
                pre = cur;
                cur = cur.next;
            }
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        Solution086 mySolution = new Solution086 ();
        //mySolution.partition (  )
    }
}

public class PartitionList {

}
