package Renzi2019;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 11:34 2019/1/1
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class HappyNumber {
}

class Solution202 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet <> (  );

        while(n != 1) {
            if(set.contains ( n )) {
                return false;
            }else {
                set.add ( n );
            }
            int sum = 0, last;
            while(n > 0) {
                last = n % 10;
                sum += last * last;
                n = n / 10;
            }
            n = sum;
        }
        return true;
    }
}