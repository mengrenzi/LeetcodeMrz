/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 22:14 2018/12/9
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class LargestElementinAnArray {
}

class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        if(nums == null && nums.length == 0) return 0;
        int left = 0;
        int right = nums.length - 1;
        while(true){
            int pos = quickSelect ( nums, left, right );
            if(pos + 1 == k) {
                return nums[pos];
            } else if(pos + 1 < k) {
                left = pos + 1;
            } else {
                right = pos - 1;
            }
        }
    }

    private void swap(int[] nums, int left, int right){
        int tmp = nums[left + 1];
        nums[left] = nums[right];
        nums[right] = tmp;
    }

    private int quickSelect(int[] nums, int left, int right) {
        int ptvot = nums[left];
        while(true) {
        }
    }
}

