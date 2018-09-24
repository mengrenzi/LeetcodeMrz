import java.util.HashSet;
import java.util.Set;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 20:31 2018/9/22
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution028 {
    public int strStr(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int k = 0; ; k++) {
                if (k == needle.length ()) return i;
                if (k + i == haystack.length ()) return -1;
                if (needle.charAt ( i ) != haystack.charAt ( i + k )) break;
            }
        }
    }
}

public class implementStr {
    public void main(String[] args) {
        Solution028 mysolution = new Solution028 ();
        System.out.println ( mysolution.strStr ( "mississippi", "issip" ) );
    }
}

