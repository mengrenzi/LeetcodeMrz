package Renzi2019;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 10:24 2018/12/25
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class MoveZeroes {
    class Solution {
        public void moveZeroesMe(int[] nums) {
            if(nums.length == 0) return;
            int after = nums.length;
            for(int i = 0; i< after; i++) {
                if(nums[i] == 0) {
                    for(int j = i + 1; j< after; j++) {
                        nums[j - 1] = nums[j];
                    }
                    nums[after - 1] = 0;
                    after--;
                }
            }
        }

        public void moveZeroes(int[] nums) {
            if(nums.length == 0) return;

            int pointer = 0;

            for(int num : nums) {
                if(num != 0) {
                    nums[pointer++] = num;
                }
            }

            for(int i = pointer; i< nums.length; i++) {
                nums[i] = 0;
            }
        }
    }
}
