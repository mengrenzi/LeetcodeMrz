package Renzi2019;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 14:00 2018/12/25
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class FindKthLargest {
    public static int findKthLargest(int[] nums, int k) {
        if(nums.length == 0) return -1;
        return help (0, nums.length - 1, nums, k);
    }

    private static int help(int start, int last, int[] nums, int k) {
        if(start == last) return nums[start];
        int pivot = nums[start];
        int left = start, right = last + 1;
        while(right > left) {
            while( last > left && nums[++left] < pivot);
            while( right > start && nums[--right] > pivot);
            if(left >= right) break;
            swap ( nums, left, right );
        }
        swap(nums, start, right);

        int x = nums.length - right;
        if(x == k) {
            return pivot;
        }else if(x > k) {
            return help ( left, last, nums, k );
        }else{
            return help ( start, right - 1, nums,k );
        }
    }

    private static void swap(int[] nums, int x, int y) {
        int tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
    }


    public static void main(String[] args) {
        System.out.println ( findKthLargest ( new int[]{3,2,1,5,6,4}, 2 ) );
    }
}
