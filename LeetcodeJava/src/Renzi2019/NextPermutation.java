package Renzi2019;

import java.util.Arrays;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 14:23 2019/1/1
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class NextPermutation {
}



class Solution31 {
    public static void nextPermutation(int[] nums) {
        int i;
        for(i = nums.length - 1; i > 0; i--) {
            if(nums[i] > nums[i-1]) {
                break;
            }
        }

        int len = nums.length - 1;

        while(len > i) {
            swap ( i++, len--, nums);
        }

    }

    private static void swap(int i, int j, int[] sArray) {
        int tmp = sArray[i];
        sArray[i] = sArray[j];
        sArray[j] = tmp;
    }

    public static void main(String[] args) {
        nextPermutation ( new int[]{1,1} );
    }

}