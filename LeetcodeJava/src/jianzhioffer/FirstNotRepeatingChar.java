package jianzhioffer;

import java.util.HashMap;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 12:25 2018/12/22
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        HashMap<Character, Integer> map = new HashMap <> (  );
        for(int i = 0; i< str.length (); i++) {
            if(map.get ( str.charAt ( i ) ) == null) {
                map.put ( str.charAt ( i ), 1);
            } else{
                map.put ( str.charAt ( i ), map.get ( str.charAt ( i ) ) + 1 );
            }
        }

        for(int i = 0; i< str.length (); i++) {
            if(map.get ( str.charAt ( i ) ) == 1) {
                return i;
            }
        }
        return -1;
    }
}
