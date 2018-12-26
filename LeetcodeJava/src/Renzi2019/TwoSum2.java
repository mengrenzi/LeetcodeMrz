package Renzi2019;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 15:58 2018/12/25
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int[] x = new int[2];
        if(numbers.length < 2 || numbers[0] > target) return x;
        int left = 0, right = numbers.length - 1;

        while(left < right) {
            int v = numbers[left] + numbers[right];
            if(v < target) {
                left++;
            }
            if(v == target) {
                x[0] = left+1;
                x[1] = right+1;
                break;
            }
            if(v > target) {
                right--;
            }
        }
        return x;
    }
}
