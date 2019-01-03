package Renzi2019;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 14:28 2019/1/3
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class NumsSameConsecDiff {
}

class Solution967 {

    public static int[] numsSameConsecDiff(int N, int K) {
        LinkedList<Integer> lists = new LinkedList <> (  );
        if(N == 1) lists.add ( 0 );
        for(int i = 1; i< 10; i++) {
            help ( N - 1, K, i, i, lists );
        }
        int[] result = new int[lists.size ()];
        int len = lists.size ();
        for (int i = 0; i< len; i++) {
            result[i] = lists.pop ();
        }
        return lists.stream().mapToInt(i->i).toArray();

//        return result;
    }

    private static void help(int N, int K, int cur, int x, List<Integer> lists) {
        if(cur > 9 || cur < 0) return;
        if(N == 0) {lists.add ( x ); return;}
        help ( N - 1, K, cur + K, x * 10 + cur + K, lists );
        if(K == 0) return;
        help ( N - 1, K, cur - K, x * 10 + cur - K, lists );
    }

    public static void main(String[] args) {
        numsSameConsecDiff ( 1, 1 );
    }
}
