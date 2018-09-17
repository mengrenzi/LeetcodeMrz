/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 10:51 2018/9/16
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */


class Solution008 {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int rev = 0, tmp = x;
        while(tmp > 0){
            rev *= 10;
            rev += tmp % 10;
            tmp /= 10;
        }
        return x == rev;
    }
}

public class palindromeNum {
    public static void main(String[] args){
        Solution008 mysolution = new Solution008 ();
        System.out.println(mysolution.isPalindrome( 1000021 ));
    }
}
