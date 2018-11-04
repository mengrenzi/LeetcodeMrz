/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 19:47 2018/11/1
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution091 {
    public int numDecodings(String s) {
        if(s == null) return 0;
        int len = s.length ();
        int[] x = new int[len];
        if(s.charAt ( 0 ) == '0') return 0;
        else x[0] = 1;

        for(int i = 1; i< s.length (); i++) {
            if(s.charAt(i) == '0') {
                if(s.charAt ( i - 1 ) >= '3' || s.charAt ( i - 1 ) <= '0' )
                    return 0;
                else{
                    if(i == 1) {
                        x[i] = 1;
                    }else {
                        x[i] = x[i - 2];
                    }
                }
            }else {
                if(s.charAt ( i - 1 ) != '0' && Integer.parseInt ( s.substring (i-1, i+1) ) <= 26) {
                    x[i] = x[i-1] + x[i-2];
                }else {
                    x[i] = x[i-1];
                }
            }
        }
        return x[len - 1];
    }

    public int numDecodings2(String s) {
        if(s == null) return 0;
        int len = s.length ();
        if(s.charAt ( 0 ) == '0') return 0;
        int curWay = 1, preWay = 1, temp;

        for(int i = 1; i< s.length (); i++) {
            temp = curWay;
            if(s.charAt(i) == '0') {
                if(s.charAt ( i - 1 ) >= '3' || s.charAt ( i - 1 ) <= '0' )
                    return 0;
                else
                    curWay = preWay;
            }else {
                if(s.charAt ( i - 1 ) != '0' && Integer.parseInt ( s.substring (i-1, i+1) ) <= 26) {
                    curWay += preWay;
                }
            }
            preWay = temp;
        }
        return curWay;
    }
}

public class DecodeWay {
}
