/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 11:25 2018/9/26
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution034 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        int left = 0, right = nums.length - 1, mid;

        while(left + 1 < right){
            mid = (left + right)/2;

            if(nums[mid] >= target) {
                right = mid;
            }
            else{
                left = mid;
            }
        }
        if(nums[left] == target) result[0] = left;
        else if(nums[right] == target) result[0] = right;
        else return result;

        left = 0;
        right = nums.length - 1;

        while(left + 1 < right){
            mid = (left + right)/2;

            if(nums[mid] > target) {
                right = mid;
            }
            else{
                left = mid;
            }
        }

        if(nums[left] == target) result[1] = left;
        else if(nums[right] == target) result[1] = right;

        return result;
    }
}

public class FindFirstandLastPositionofElementinSortedArray {
}
