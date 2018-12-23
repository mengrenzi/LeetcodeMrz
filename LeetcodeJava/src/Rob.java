/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 17:33 2018/12/23
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class Rob {
}

class Solution198 {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] help = new int[nums.length + 3];
        for (int i = nums.length - 1; i >= 0; i--) {
            help[i] = nums[i] + Math.max ( help[i + 2], help[i + 3] );
        }

        return Math.max ( help[0], help[1] );
    }
}