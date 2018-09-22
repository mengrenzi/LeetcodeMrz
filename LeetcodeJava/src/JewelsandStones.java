import java.util.HashSet;
import java.util.Set;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 10:26 2018/9/21
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution771 {
    public int numJewelsInStones(String J, String S) {
        char[] JArray = J.toCharArray ();
        char[] SArray = S.toCharArray ();
        int count = 0;
        Set SetJ = new HashSet();

        for( char chJ : JArray){
            SetJ.add ( chJ );
        }
        for( char chS : SArray){
            if(SetJ.contains ( chS )){
                count ++;
            }
        }
        return count;
    }
}

public class JewelsandStones {
}
