/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 8:28 2018/11/25
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class SingleNumber2 {
}

class Solution137 {
    public int singleNumber(int[] nums) {
        int flag = Integer.MAX_VALUE;
        for(int i = 0; i< nums.length; i++) {
            if(nums[i] == flag) {continue;}
            int count = 0;
            for(int j = i + 1; j< nums.length; j++) {
                if(nums[j] == flag) {continue;}
                if(nums[i] == nums[j]) {
                    nums[j] = flag;
                    count ++;
                }
                if(count == 2) break;
            }
            if(count == 0) return nums[i];
            nums[i] = flag;
        }
        return nums[0];
    }
}