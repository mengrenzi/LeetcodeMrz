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
    public static String frequencySort(String s) {
        if(s == null || s.length () == 0) {return s;}
        HashMap<Character, Integer> map = new HashMap <> (  );

        for(char c : s.toCharArray ())
            map.put ( c, map.getOrDefault ( c , 0 ) + 1);

        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        pq.addAll ( map.entrySet () );

        StringBuilder sb = new StringBuilder (  );
        while (!pq.isEmpty()) {
            Map.Entry e = pq.poll();
            for (int i = 0; i < (int)e.getValue(); i++)
                sb.append(e.getKey());
        }

        return sb.toString ();
    }

    public static void main(String[] args) {
        frequencySort ( "raaeaedere" );
    }
}