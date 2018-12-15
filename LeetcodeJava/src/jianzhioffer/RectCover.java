package jianzhioffer;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 22:57 2018/12/15
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class RectCover {
    public int RectCover(int target) {
        int[] ans = new int[target + 2];
        if(target <= 0) return ans[0];
        ans[1] = 1;
        ans[2] = 2;

        for(int i = 3; i<= target; i++) {
            ans[i] = ans[i - 1] + ans[i - 2];
        }

        return ans[target];
    }
}
