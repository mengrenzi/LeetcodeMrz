package jianzhioffer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 11:29 2018/11/25
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList res = new ArrayList<Integer> (  );
        while (listNode != null) {
            res.add ( listNode.val );
            listNode = listNode.next;

        }
        Collections.reverse ( res );

        ArrayList myRes = new ArrayList<Integer> (  );
        for(int i = 0; i< res.size (); i++) {
            int j = res.size () - 1 - i;
            myRes.add ( res.get ( i ) );
        }

        return myRes;
    }


}
