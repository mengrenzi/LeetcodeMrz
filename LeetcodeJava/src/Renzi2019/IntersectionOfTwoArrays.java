package Renzi2019;

import java.util.HashSet;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 9:43 2019/1/1
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet <> (  );
        HashSet<Integer> set2 = new HashSet <> (  );

        for(int num1 : nums1) {
            set1.add ( num1 );
        }

        for(int num2 : nums2) {
            if(set1.contains ( num2 ))
                set2.add ( num2 );
        }

        int[] x = new int[set2.size ()];
        int count = 0;

        for(int set : set2) {
            x[count++] = set;
        }

        return x;
    }
}
