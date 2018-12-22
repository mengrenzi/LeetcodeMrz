package jianzhioffer;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 13:42 2018/12/22
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class InversePairs {
    public int InversePairs(int [] array) {
        if(array == null || array.length == 0) return 0;
        final int mod = 1000000007;
        int count = 0;
        for(int i = 0; i< array.length; i++) {
            for(int j = i + 1; j< array.length; j++) {
                if(array[i] > array[j]) {
                    count++;
                }
            }
        }
        return count % mod;
    }
}
