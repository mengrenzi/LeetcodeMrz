package Renzi2019;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 11:49 2018/12/25
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2.length == 0) return;
        int p2 = 0;
        for(int i = m; i< nums1.length; i++) {
            nums1[i] = Integer.MAX_VALUE;
        }

        for(int i = 0; i< nums1.length; i++) {
            if(p2< nums2.length && nums1[i] > nums2[p2]) {
                for(int j = p2 + m; j> i; j--) {
                    swap ( nums1, j, j - 1);
                }
                nums1[i] = nums2[p2++];
            }
        }
    }

    private void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while(i>-1 && j > -1) nums1[k--] = (nums1[i--] > nums2[j--]) ? nums1[i] : nums2[j];
        while(j>-1) nums1[k--] = nums2[j--];
    }
}
