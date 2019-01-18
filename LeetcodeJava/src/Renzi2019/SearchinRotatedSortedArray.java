package Renzi2019;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 17:35 2019/1/17
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) return -1;
        int left = 0, right = nums.length - 1;
        int mid;
        while(left <= right) {
            mid = (left + right) /2;
            if(nums[mid] == target) return mid;
            if(nums[left] <= nums[mid]) {
                if(nums[left] <= target && nums[mid] > target) {
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }else {
                if(nums[mid] < target && nums[right] >= target) {
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}
