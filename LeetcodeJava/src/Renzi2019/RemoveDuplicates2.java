package Renzi2019;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 11:26 2018/12/25
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class RemoveDuplicates2 {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

        int idx = 0, count = 0;

        for(int num : nums) {
            if(idx == 0) {
                idx++;
                continue;
            }
            if( nums[idx - 1] != num) {
                nums[idx++] = num;
                count = 0;
            }else if(count < 1){
                nums[idx++] = num;
                count++;
            }
        }

        return idx;
    }
}
