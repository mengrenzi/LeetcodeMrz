package Renzi2019;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 13:01 2018/12/27
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String result = "";
        if(s == null || s.length () == 0) return result;

        for(int i = 0; i< s.length (); i++) {
            if(result.length () < oddPalindrome ( s, i )) {
                result = s.substring ( i - oddPalindrome ( s, i)/2, i + oddPalindrome ( s, i)/2 + 1);
            }

            if(result.length () < evenPalindrome ( s, i)) {
                result = s.substring ( i - evenPalindrome ( s, i)/2 + 1, i + evenPalindrome ( s, i)/2 +1 );
            }

        }
        return result;
    }


    public int oddPalindrome(String s, int start) {
        int max = 1;
        int end = start + 1;
        while(start > 0 && end < s.length ()) {
            if(s.charAt ( start - 1 ) == s.charAt ( end )) {
                max = end - start + 2;
            }
            else {
                break;
            }
            start --;
            end ++;
        }
        return max;
    }


    public int evenPalindrome(String s, int start) {
        int max = 0;
        int end = start + 1;
        while(start >= 0 && end < s.length ()) {
            if(s.charAt ( start ) == s.charAt ( end )) {
                max = end - start + 1;
            }
            else {
                break;
            }
            start --;
            end ++;
        }
        return max;
    }
}
