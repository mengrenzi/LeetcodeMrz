/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 16:01 2018/9/13
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */


class Solution005 {
    int maxLen, start;

    public String longestPalindrome(String s) {
        if (s.length () < 2){
            return s;
        }

        for(int i = 0; i< s.length (); i++){
            extendStrings ( s, i, i);
            extendStrings ( s, i-1, i);
        }

        return s.substring ( start , start + maxLen );
    }

    private void extendStrings(String s, int first, int last){
        for(;first >= 0 && last < s.length () && s.charAt ( first ) == s.charAt ( last ); first--, last++);

        if(maxLen < last - first - 1){
            start = first + 1;
            maxLen = last - first - 1;
        }
    }
}

public class longestPS {
    public static void main(String[] args){
        Solution005 mysolution = new Solution005 ();
        System.out.println(mysolution.longestPalindrome ( "abba" ));
    }
}

