package Renzi2019;

import java.util.HashMap;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 9:58 2018/12/25
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int[] result = new int[2];
        for (int x: nums) {
            if(!map.containsKey ( target - x )) {
                map.put ( x, i++ );
            }else {
                result[0] = map.get ( target - x );
                result[1] = i;
            }
        }
        return result;
    }

}

