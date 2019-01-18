package Renzi2019;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 16:47 2019/1/17
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class StrStr {
    public int strStr(String haystack, String needle) {
        if(needle.length () > haystack.length ()) return -1;
        if(needle.length () == 0 && haystack.length () == 0) return 0;
        for(int i = 0; i< haystack.length (); i++) {
            boolean bool = true;
            int tmp = i;
            for (int j = 0; j < needle.length (); j++) {
                if(tmp >= haystack.length () || haystack.charAt ( tmp ) != needle.charAt ( j )) {
                    bool = false;
                    break;
                }
                tmp++;
            }
            if(bool) {
                return i;
            }
        }
        return -1;
    }
}
