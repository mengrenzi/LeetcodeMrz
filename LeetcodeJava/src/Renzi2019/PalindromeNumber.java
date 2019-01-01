package Renzi2019;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 14:39 2018/12/27
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x!=0 && x%10==0)) {return false;}

        int rev = 0, z = x;

        while (z != 0) {
            rev = rev*10 + z%10;
            z = z / 10;
        }

        return rev == x;
    }
}
