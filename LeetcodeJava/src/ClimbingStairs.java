/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 16:26 2018/10/25
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution070 {
    public int climbStairs(int n) {
        int[] x = new int[n];
        if(n< 3) return n;
        x[0] = 1;
        x[1] = 2;
        for(int i = 2; i< n; i++) {
            x[i] = x[i - 1] + x[i - 2];
        }

        return x[n-1];
    }
}

public class ClimbingStairs {
}
