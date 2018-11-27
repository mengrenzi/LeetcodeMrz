package jianzhioffer;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 15:50 2018/11/25
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class MinNumberInRotateArray {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0) return 0;
        int idx = 0;
        for(int i = 0; i< array.length - 1; i++) {
            if(array[i] > array[i+1]) {
                return array[i + 1];
            }
        }
        return 0;
    }
}
