/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 19:02 2018/12/23
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class LengthOfLIS {
}

class Solution300 {
    public int lengthOfLIS(int[] nums) {
        int[] result = new int[nums.length];
        int max = 0;
        if(nums.length == 0) return max;
        for(int i = nums.length - 1; i >= 0; i--) {
            result[i] = 1;
            for(int j = i; j < nums.length; j ++) {
                if(nums[i] < nums[j]) {
                    result[i] = Math.max ( result[i] , result[j] + 1 );
                }
            }
            max = Math.max ( max, result[i] );
        }
        return max;
    }
}