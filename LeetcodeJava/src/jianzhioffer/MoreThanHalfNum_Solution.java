package jianzhioffer;

import java.util.HashMap;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 17:01 2018/12/21
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class MoreThanHalfNum_Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int max = array.length/2;
        HashMap<Integer, Integer> map = new HashMap <> (  );
        for (int x: array) {
            if(!map.containsKey ( x )) {
                map.put ( x, 1 );
            }else {
                map.put ( x, map.get ( x ) + 1 );
            }
            if(map.get(x) > max) {
                return x;
            }

        }
        return 0;
    }
}
