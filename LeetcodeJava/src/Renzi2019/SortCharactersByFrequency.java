package Renzi2019;

import java.util.*;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 13:58 2019/1/1
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class SortCharactersByFrequency {
}

class Solution451 {
    public String frequencySort(String s) {
        if(s == null || s.length () == 0) {return s;}
        HashMap<Character, Integer> map = new HashMap <> (  );

        for(char c : s.toCharArray ()) {
            if(!map.containsKey ( c )) {
                map.put ( c, 1 );
            }else {
                map.put ( c, map.get ( c ) );
            }
        }
    }
}