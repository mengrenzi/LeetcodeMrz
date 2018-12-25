package Renzi2019;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 14:00 2018/12/25
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        if(nums.length == 0) return -1;
        return help (0, nums.length - 1, nums, k);
    }

    private int help(int start, int last, int[] nums, int k) {
        int pivot = nums[start];
        int left = start + 1, right = last;
        while(right > left) {
            while( right > left && nums[left] < pivot) {
                left++;
            }
            while( right > left && nums[right] > pivot) {
                right--;
            }
            swap ( nums, left, right );
        }
        if(nums[left] > pivot) {
            left--;
        }else {
            right++;
        }

        int x = nums.length - right;
        if(x == k) {
            return pivot;
        }else if(x > k) {
            return help ( start + 1, left, nums,k );
        }else{
            return help ( right, last, nums, k );
        }
    }

    private void swap(int[] nums, int x, int y) {
        int tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
    }
}
