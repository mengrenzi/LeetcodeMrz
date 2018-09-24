/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 9:43 2018/9/21
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */


import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution023 {

    class NodeComparator implements Comparator<ListNode> {
        @Override
        public int compare (ListNode a, ListNode b){
            return a.val - b.val;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode ( 0 );
        if(lists.length == 0 || lists == null){
            return null;
        }

        int size = lists.length;
        ListNode current = dummy;
        NodeComparator cmp = new NodeComparator ();
        PriorityQueue<ListNode> pqueue = new PriorityQueue <> ( cmp );

        for(int i = 0; i< size; i++){
            if(lists[i] != null){
                pqueue.add(lists[i]);
            }
        }

        while(pqueue.size() !=0){
            ListNode node = pqueue.poll ();
            current.next = node;
            current = current.next;
            if(node.next != null){
                pqueue.add ( node.next );
            }
        }
        return dummy.next;
    }
}

public class MergeKSorted {


}
