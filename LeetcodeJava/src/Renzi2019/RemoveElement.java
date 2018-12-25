package Renzi2019;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 10:42 2018/12/25
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int pointer = 0;

        for(int num : nums) {
            if(num != val) {
                nums[pointer++] = num;
            }
        }

        return pointer;
    }
}
