package Review;

import java.util.HashMap;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 15:59 2018/12/14
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class TwoSum {
}

class Solution001 {
    public int[] twoSum(int[] numbers, int target) {
        int[] x = new int[2];
        HashMap<Integer, Integer> map= new HashMap<>();
        int len = numbers.length;

        if(len < 2) return x;

        for(int i = 0; i< len; i++) {
            if(map.containsKey(target - numbers[i])) {
                x[1] = map.get(numbers[i]);
                x[0] = map.get(target - numbers[i]);
                break;
            }

            map.put(numbers[i], i);
        }

        return x;
    }
}