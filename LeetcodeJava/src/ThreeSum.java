import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 10:43 2018/9/17
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution015 {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> results = new LinkedList <> (  );
        Arrays.sort(nums);
        int headPointer, tailPointer, base;

        for(int i = 0; i< nums.length-2; i++){

            base = nums[i] * (-1);
            headPointer = i + 1;
            tailPointer = nums.length - 1;

            while(headPointer < tailPointer){
                if(nums[headPointer] + nums[tailPointer] == base){
                    results.add ( Arrays.asList (nums[i],nums[headPointer],nums[tailPointer]));
                    while(headPointer < tailPointer && nums[headPointer] == nums[headPointer+1] ){
                        headPointer++;
                    }
                    while(headPointer < tailPointer && nums[tailPointer] == nums[tailPointer-1] ){
                        tailPointer--;
                    }
                    headPointer++;
                    tailPointer--;
                }

                while (headPointer < tailPointer && nums[headPointer] + nums[tailPointer] < base) {
                    headPointer++;
                }

                while (headPointer < tailPointer && nums[headPointer] + nums[tailPointer] > base) {
                    tailPointer--;
                }
            }

            while( i < nums.length - 1 && nums[i+1] == nums[i]){
                i++;
            }
        }
        return results;
    }
}

public class ThreeSum {
    public static void main(String[] args){
        Solution015 mysolution = new Solution015 ();
        int[] x = {-1,0,1,2,-1,-4};
        System.out.println(mysolution.threeSum(x));
    }
}
