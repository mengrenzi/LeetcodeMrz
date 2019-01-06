package jianzhioffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 13:40 2019/1/5
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class LastRemaining {
    public static int LastRemaining_Solution(int n, int m) {
        if(n <= 1) return -1;
        LinkedList<Integer> list = new LinkedList<> (  );

        for(int i = 0; i< n; i++) {
            list.add ( i );
        }

        int x = 0;
        while(list.size () > 1) {
            n = list.size ();
            x = (x + m - 1) % n;
            list.remove ( x );
        }
        return list.pop ();
    }

    public static void main(String[] args) {
        LastRemaining_Solution ( 5, 3 );
    }
}
