package Renzi2019;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 17:07 2019/1/17
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class SearchInsert {
    public static int searchInsert(int[] nums, int target) {
        return help ( 0, nums.length - 1, nums, target );
    }

    public static int help(int left, int right, int[] nums, int target) {
        int mid = (left + right) / 2;
        if(left > right) return left;

        if(nums[mid] > target) {
            return help ( left, mid - 1, nums, target );
        }else if(nums[mid] < target) {
            return help ( mid + 1, right, nums, target );
        }else  {
            return mid;
        }
    }

    public static void main(String[] args) {
        searchInsert ( new int[]{1, 3, 5, 6}, 2 );
    }
}
