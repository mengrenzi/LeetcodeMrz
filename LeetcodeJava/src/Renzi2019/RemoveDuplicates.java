package Renzi2019;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 10:49 2018/12/25
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

        int idx = 0;

        for(int num : nums) {
            if(idx == 0) {
                idx++;
                continue;
            }
            if( nums[idx - 1] != num) {
                nums[idx++] = num;
            }
        }

        return idx;
    }
}
