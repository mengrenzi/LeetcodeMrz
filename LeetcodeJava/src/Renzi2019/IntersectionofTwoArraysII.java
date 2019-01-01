package Renzi2019;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 10:03 2019/1/1
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class IntersectionofTwoArraysII {
}

class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> nums1Map = new HashMap<> (  );
        LinkedList<Integer> list = new LinkedList <> (  );

        for(int num : nums1) {
            if(!nums1Map.containsKey ( num )) {
                nums1Map.put ( num, 1 );
            }else {
                nums1Map.put ( num, nums1Map.get ( num ) );
            }
        }

        for (int aNums2 : nums2) {
            if (nums1Map.containsKey ( aNums2 ) && nums1Map.get ( aNums2 ) > 0) {
                list.add ( aNums2 );
                nums1Map.put ( aNums2, nums1Map.get ( aNums2 ) - 1 );
            }
        }
        int[] result = new int[list.size ()];
        int count = 0;

        for(int aList : list) {
            result[count++] = aList;
        }

        return result;
    }
}