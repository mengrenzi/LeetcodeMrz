/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 16:23 2018/9/27
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution053 {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0 || nums == null)
        {
            return 0;
        }

        int[] dp = new int[nums.length];
        int sum = nums[0];
        dp[0] = nums[0];
        for(int i = 1; i< nums.length; i++){
            dp[i] = nums[i] + (dp[i-1] > 0 ? dp[i-1]:0);
            sum = Math.max ( dp[i], sum );
        }

        return sum;
    }
}

public class MaximuSubarry {

}
