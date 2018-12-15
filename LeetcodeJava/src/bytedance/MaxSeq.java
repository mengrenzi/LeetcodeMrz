package bytedance;

import java.util.Scanner;

/**
 * @Description:一个整数数组中的元素有正有负，在该数组中找出一 个连续子数组，要求该连续子数组中各元素的和最大，这个连续子数组便被称作最大连续子数组。比如数组 {2,4,-7,5,2,-1,2,-4,3} 的最大连续子数组为{5,2,-1,2}，最大连续子数组的和为 5+2-1+2=8。问题输入就是一个数组，输出该数组的“连续子数组的最大和”。
 * @Author: Renzi Meng
 * @Date: Created in 19:26 2018/12/9
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

// 思路，动态规划，状态转移方程: DP[i] = max{DP[i-1] + A[i],A[i]};

public class MaxSeq {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) {return 0;}
        int[] dp = new int[nums.length];
        dp[0] = nums[0];

        for(int i = 1; i< nums.length; i++){
            dp[i] = Math.max ( dp[i-1] + nums[i-1], nums[i]);
        }

        int res = dp[0];
        for (int tmp : dp) {
            res = Math.max ( res, tmp );
        }

        return res;
    }

}
