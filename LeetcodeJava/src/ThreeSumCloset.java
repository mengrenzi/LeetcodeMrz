import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 13:20 2018/9/17
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution016 {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int headPointer, tailPointer, base, minResult = 99999, sum = 0;

        for(int i = 0; i< nums.length-2; i++){
            base = target - nums[i];
            headPointer = i + 1;
            tailPointer = nums.length - 1;

            while(headPointer < tailPointer){
                if(nums[headPointer] + nums[tailPointer] == base){
                    return nums[headPointer] + nums[tailPointer] + nums[i];
                }

                while (headPointer < tailPointer && nums[headPointer] + nums[tailPointer] < base) {
                    if(minResult > Math.abs(nums[headPointer] + nums[tailPointer] - base)){
                        sum = nums[headPointer] + nums[tailPointer] + nums[i];
                        minResult = Math.abs(nums[headPointer] + nums[tailPointer] - base);
                    }
                    headPointer++;
                }


                while (headPointer < tailPointer && nums[headPointer] + nums[tailPointer] > base) {
                    if(minResult > Math.abs(nums[headPointer] + nums[tailPointer] - base)){
                        sum = nums[headPointer] + nums[tailPointer] + nums[i];
                        minResult = Math.abs(nums[headPointer] + nums[tailPointer] - base);
                    }
                    tailPointer--;
                }
            }

            while( i < nums.length - 1 && nums[i+1] == nums[i]){
                i++;
            }
        }
        return sum;
    }
}

public class ThreeSumCloset {
    public static void main(String[] args){
        Solution016 mysolution = new Solution016 ();
        int[] x = {0,1,2};
        System.out.println(mysolution.threeSumClosest(x,3));
    }
}
