package Renzi2019;

import java.util.Arrays;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 14:42 2019/1/2
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class ThreeSumClosest {
}

class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length < 3) return -1;
        int value = 0;
        int myTarget, min = Integer.MAX_VALUE;
        Arrays.sort ( nums );
        for(int i = 0; i < nums.length - 2; i++) {
            myTarget = target - nums[i];
            int start = i + 1, end = nums.length - 1;
            while(start < end) {
                if(min > Math.abs(nums[start] + nums[end] + nums[i] - target)) {
                    value = nums[start] + nums[end] + nums[i];
                    min = Math.abs(nums[start] + nums[end] + nums[i] - target);
                }
                if(value == 0) return 0;
                if(nums[start] + nums[end] > myTarget) start++;
                else end--;
            }
        }
        return value;
    }

    public static int threeSumClosest2(int[] nums, int target) {
        Arrays.sort ( nums );
        int closest = nums[0] + nums[1] + nums[2];
        int low, high;
        for (int i = 0; i < nums.length - 1; i++) {
            low = i + 1;
            high = nums.length - 1;
            while (low < high) {
                if (nums[low] + nums[high] == target - nums[i]) return target;
                else if (nums[low] + nums[high] > target - nums[i]) {
                    while (low < high && nums[low] + nums[high] > target - nums[i]) high--;
                    if (Math.abs ( nums[i] + nums[low] + nums[high + 1] - target ) < Math.abs ( closest - target ))
                        closest = nums[i] + nums[low] + nums[high + 1];
                } else {
                    while (low < high && nums[low] + nums[high] < target - nums[i]) low++;
                    if (Math.abs ( nums[i] + nums[low - 1] + nums[high] - target ) < Math.abs ( closest - target ))
                        closest = nums[i] + nums[low - 1] + nums[high];
                }
            }
        }
        return closest;
    }


    public static void main(String[] args) {
        threeSumClosest2 ( new int[]{-1, 2, 1, -4}, 1 );
    }
}
