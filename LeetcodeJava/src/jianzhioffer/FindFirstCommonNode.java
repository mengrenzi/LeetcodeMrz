package jianzhioffer;

import java.util.Stack;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 14:02 2018/12/22
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class FindFirstCommonNode {
    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2 == null) return null;
        Stack<ListNode> stack1 = new Stack <> ();
        Stack<ListNode> stack2 = new Stack <> ();

        while(pHead1 != null) {
            stack1.add ( pHead1 );
            pHead1 = pHead1.next;
        }
        while(pHead2 != null) {
            stack2.add ( pHead2 );
            pHead2 = pHead2.next;
        }

        if(stack1.peek () != stack2.peek ()) return null;

        ListNode res = stack1.peek ();

        while(!stack1.isEmpty () && !stack2.isEmpty () && stack1.peek () == stack2.peek () ) {
            res = stack1.peek ();
            stack1.pop ();
            stack2.pop ();
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode ( 1 );
        l1 = l1.next;
        l1 = new ListNode ( 2 );
        l1 = l1.next;
        l1 = new ListNode ( 3 );
        l1 = l1.next;
        l1 = new ListNode ( 4 );
        FindFirstCommonNode(l1,l1);
    }
}
