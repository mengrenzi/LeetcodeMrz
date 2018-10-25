/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 20:32 2018/10/18
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution055 {
    public boolean canJump(int[] nums) {
        int maxLen = 0;
        for(int i = 0; i< nums.length; i++){
            maxLen = Math.max(maxLen, nums[i] + i);
            if(maxLen >= nums.length - 1){
                return true;
            }
            if(maxLen< i + 1){
                break;
            }
        }
        return false;
    }
}

public class JumpGame {
}
