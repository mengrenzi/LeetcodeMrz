package Renzi2019;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 15:21 2019/1/2
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class FourSumCount {
}

class Solution454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int count = 0;

        Map<Integer, Integer> map = new HashMap<> (  );

        for(int a : A) {
            for(int b : B) {
                map.put ( a + b, map.getOrDefault ( a + b, 0 ) + 1 );
            }
        }

        for(int c : C) {
            for(int d : D) {
                count += map.getOrDefault ( -(c + d), 0  );
            }
        }

        return count;
    }
}
