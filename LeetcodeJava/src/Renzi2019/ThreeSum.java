package Renzi2019;

import org.omg.CORBA.INTERNAL;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.*;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 14:37 2018/12/26
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new LinkedList <> (  );
        LinkedList<Integer> list = new LinkedList<> (  );
        Arrays.sort ( nums );
        for(int i = 0; i< nums.length - 2; i++) {
            if(i > 0 && nums[i-1] == nums[i]) continue;
            int target = 0 - nums[i];

            int start = i + 1, end = nums.length - 1;
            while(start < end) {
                if(nums[start] + nums[end] == target) {
                    lists.add ( Arrays.asList ( nums[i] ,nums[start], nums[end] ) );
                    start++;
                    end--;
                    while(start < end && nums[start] == nums[start - 1]){
                        start++;
                    }
                }else if(nums[start] + nums[end] < target) {
                    start++;
                }else {
                    end--;
                }
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        threeSum ( new int[]{-2,0,0,2,2} );
    }
}
