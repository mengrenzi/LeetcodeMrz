import java.util.ArrayList;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 16:31 2018/11/23
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class RansomNote {
}

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charCount = new int[26];

        for(int j = 0; j< magazine.length (); j++) {
            charCount[magazine.charAt ( j ) - 'a']++;
        }

        for(int i = 0; i< ransomNote.length (); i++) {
            int x = ransomNote.charAt ( i ) - 'a';
            charCount[x]--;
            if(charCount[x] <0) {
                return false;
            }
        }

        return true;
    }
}