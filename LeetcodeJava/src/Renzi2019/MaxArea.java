package Renzi2019;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 14:14 2018/12/26
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class MaxArea {
    public int maxArea(int[] height) {
        if(height.length <= 1) return 0;

        int i = 0, j = height.length - 1;
        int max = Math.min ( height[i], height[j] ) * (j - i + 1);

        while(i < j) {
            if(height[i] > height[j]) {
                j--;
            }else {
                i++;
            }
            max = Math.max ( max, Math.min ( height[i], height[j] ) * (j - i + 1) );
        }

        return max;
    }
}
