package bytedance;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 15:13 2018/12/12
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

public class qy1 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode ( 1 );
        ListNode l1Tmp= l1;
        l1Tmp.next = new ListNode ( 2 );
        l1Tmp = l1Tmp.next;
        l1Tmp.next = new ListNode ( 3 );
        l1Tmp = l1Tmp.next;
        l1Tmp.next = new ListNode ( 4 );

        ListNode l2 = new ListNode ( 2 );
        ListNode l2Tmp= l2;
        l2Tmp.next = new ListNode ( 3 );
        l2Tmp =l2Tmp.next;
        l2Tmp.next = new ListNode ( 4 );

        int l1Size = 0, l2Size = 0;

        ListNode tmp = l1;
        while(tmp.next != null) {
            l1Size++;
            tmp = tmp.next;
        }

        tmp = l2;
        while(tmp.next != null) {
            l2Size++;
            tmp = tmp.next;
        }

        int x = l1Size - l2Size;
        ListNode res = new ListNode ( 0 );
        ListNode resTmp = res;
        for(int i = 0; i< x; i++) {
            res.val = l1.val;
            res = res.next;
            l1 = l1.next;
        }

        for(int i = 0; i< l2Size; i++) {
            res.val = l2.val + l1.val;
            res = res.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        for(int i = 0; i< l1Size; i++) {
            System.out.println ( resTmp.val );
            resTmp = resTmp.next;
        }
    }
}
