import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 22:01 2018/10/17
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution088 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m; i< m+n; i++){
            nums1[i] = nums2[i - m];
        }
        Arrays.sort(nums1);
    }
}

public class MergeSortedArray {
}
