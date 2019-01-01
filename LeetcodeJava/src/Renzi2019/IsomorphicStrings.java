package Renzi2019;

import java.util.HashMap;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 12:02 2019/1/1
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class IsomorphicStrings {
}

class Solution205 {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length ()) return false;
        int[] sArray = new int[26];
        int[] tArray = new int[26];

        for(int i = 0; i< s.length (); i++) {
            if(sArray[s.charAt ( i ) - 'a'] != tArray[t.charAt ( i )] - 'a') return false;
            sArray[s.charAt ( i ) - 'a'] = i + 1;
            tArray[t.charAt ( i ) - 'a'] = i + 1;
        }

        return true;
    }

}
