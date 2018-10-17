/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 18:56 2018/10/17
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution058 {
    public int lengthOfLastWord(String s) {
        int i, k;
        s = ' ' + s;
        for(k = s.length() - 1; k >= 0 && s.charAt(k) == ' ';k--);
        if(k == -1) return 0;
        for(i = k; i > 0 && s.charAt(i) != ' '; i--);
        return s.length () - i - 1;
    }

    public static void main(String[] args) {
        Solution058 mysolution = new Solution058 ();
        System.out.println ( mysolution.lengthOfLastWord ( "a" ) );
    }
}

public class LengthOfLastWord {
}
