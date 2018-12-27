package Renzi2019;

import java.util.HashMap;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 12:36 2018/12/26
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;

        for(int i = 0, j = 0; i< s.length (); i++) {
            char c = s.charAt ( i );
            if(map.containsKey ( c )) {
                j = Math.max ( j, map.get ( c ) + 1);
            }
            map.put ( c, i);
            max = Math.max ( i - j + 1, max);
        }

        return max;
    }
}