package Renzi2019;

import java.util.HashMap;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 11:05 2019/1/1
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class ValidAnagram {
}

class Solution242 {
    public boolean isAnagram(String s, String t) {
        if(s.length () != t.length ()) return false;
        int[] alphbets = new int[26];
        for(char aS : s.toCharArray ()) {alphbets[aS-'a']++;}
        for(char aT : t.toCharArray ()) {alphbets[aT-'a']--;}

        for(int alphbet : alphbets) {
            if(alphbet != 0) return false;
        }
        return true;
    }
}