import java.util.HashMap;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 19:28 2018/12/23
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class repeatedNTimes {
}

class Solution961 {
    public int repeatedNTimes(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<> (  );
        for(int i = 0; i< A.length; i++) {
            if(!map.containsKey ( A[i] )) {
                map.put ( A[i], 1 );
            }else {
                return A[i];
            }
        }
        return A[0];
    }
}