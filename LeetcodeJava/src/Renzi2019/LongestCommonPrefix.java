package Renzi2019;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 11:49 2019/1/2
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class LongestCommonPrefix {
}

class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)    return "";

        int end = strs[0].length () - 1;
        String pre = strs[0];
        for(int i = 1; i < strs.length; i++) {
            end = Math.min ( end, strs[i].length () - 1);
            if(end < 0) break;
            int j;
            for(j = 0; j <= end; j++) {
                if(strs[0].charAt ( j ) != strs[i].charAt ( j )) break;
            }
            end = j - 1;
        }

        return strs[0].substring ( 0, end+1 );
    }
}