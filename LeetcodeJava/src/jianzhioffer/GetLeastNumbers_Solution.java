package jianzhioffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 17:11 2018/12/21
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class GetLeastNumbers_Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        Arrays.sort (input);
        ArrayList<Integer> x = new ArrayList (  );
        if(input.length < k) return null;
        for(int i = 0; i< k; i++) {
            x.add ( input[i] );
        }
        return x;
    }

    public ArrayList<Integer> GetLeastNumbers_Solution2(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<> (  );
        if(input.length < k || k <= 0) return res;
        PriorityQueue<Integer> pq = new PriorityQueue <Integer> ( k, new Comparator <Integer> () {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        for (int x: input) {
            if(pq.size ()< k) {
                pq.add ( x );
            }else {
                if(pq.peek () > x) {
                    pq.poll ();
                    pq.add ( x );
                }
            }
        }

        for(Integer x : pq) {
            res.add ( x );
        }

        return res;
    }

}
