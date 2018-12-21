package jianzhioffer;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 17:35 2018/12/21
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array == null || array.length == 0) return 0;
        int[] x = new int[array.length];
        x[0] = array[0];
        int max = x[0];

        for(int i = 1; i< array.length; i++) {
            x[i] = Math.max ( x[i - 1] + array[i], array[i] );
            max = Math.max ( max, x[i] );
        }

        return max;
    }
}
