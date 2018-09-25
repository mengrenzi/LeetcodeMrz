/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 12:00 2018/9/24
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution029 {
    public int divide(int dividend, int divisor) {
        if(divisor == 0) return Integer.MAX_VALUE;
        if(dividend == Integer.MIN_VALUE){
            if(divisor == -1)
                return Integer.MAX_VALUE;
            else if(divisor == 1)
                return Integer.MIN_VALUE;
        }
        long divd = dividend;
        long divs = divisor;
        int sign = 1;

        if(divd <0){
            sign = -sign;
            divd = -divd;
        }

        if(divs <0){
            divs = -divs;
            sign = -sign;
        }

        int res = 0, i;

        while(divd >= divs){
            for(i = 1; divd >= divs << i; i++);
            res += 1 << (i - 1);
            divd -= divs << (i - 1);
        }

        return res * sign;
    }
}

public class DivideTwoIntegers {


}
