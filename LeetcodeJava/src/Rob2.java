/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 18:26 2018/12/23
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class Rob2 {
}

class Solution213 {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if( nums.length == 1) return nums[0];

        int[] help = new int[nums.length + 3];
        int[] help2 = new int[nums.length + 2];

        for (int i = nums.length - 1; i > 0; i--) {
            help[i] = nums[i] + Math.max ( help[i + 2], help[i + 3] );
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            help2[i] = nums[i] + Math.max ( help2[i + 2], help2[i + 3] );
        }

        return Math.max ( Math.max(help[1],help[2]), Math.max(help2[0],help2[1]) );
    }
}