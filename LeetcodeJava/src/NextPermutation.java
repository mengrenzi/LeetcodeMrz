import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 9:54 2018/9/25
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */


class Solution031 {
    public void nextPermutation(int[] nums) {
        if(nums.length <= 1) return;

        int replace = nums.length - 2, flag = 0;
        while(replace >= 0){
            if(nums[replace] < nums[replace + 1]){
                break;
            }
            replace--;
        }

        if(replace == 0){
            Arrays.sort ( nums );
            return;
        }

        int temp;

        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] > nums[replace]){
                temp = nums[i];
                nums[i] = nums[replace];
                nums[replace] = temp;
                // sort函数 fromIndex 包含， toIndex 不含
                Arrays.sort(nums, replace+1, nums.length);
                break;
            }
        }
        return;
    }

    public void swap(int a, int b){

    }

}

public class NextPermutation {
}

