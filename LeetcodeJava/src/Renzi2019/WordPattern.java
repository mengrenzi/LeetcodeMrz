package Renzi2019;

import java.util.HashMap;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 11:43 2019/1/1
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class WordPattern {
}

class Solution290 {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> map = new HashMap <> (  );

        String[] strArray = str.split (" ");
        if(strArray.length != pattern.length ()) return false;
        for(int i = 0; i< pattern.length (); i++) {
            if(!map.containsKey ( pattern.charAt ( i ) ) && !map.containsValue ( strArray[i] )) {
                map.put ( pattern.charAt ( i ),  strArray[i]);
            }else {
                if(!map.get ( pattern.charAt ( i ) ).equals ( strArray[i] )) {
                    return false;
                }
            }
        }

        return true;
    }
}