/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 14:08 2018/9/14
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution007 {
    public int reverse(int x) {
        int flag = 1;
        long ans = 0;
        if(x < 0){ flag = -1; x = -x;}
        if(x == 0) { return 0;}

        while(x > 0){
            ans = ans * 10 + x % 10;
            x = x / 10;
        }

        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) return 0;
        return (int) ans * flag;
    }
}

public class reverseInt {
    public static void main(String[] args){
        Solution007 mysolution = new Solution007 ();
        System.out.println(mysolution.reverse(1534236469 ));
    }
}
