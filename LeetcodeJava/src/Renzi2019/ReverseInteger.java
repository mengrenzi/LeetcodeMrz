package Renzi2019;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 14:19 2018/12/27
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;
        while(x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result) {
                return 0;
            }
            result = newResult;
            x = x / 10;
        }
        return result;
    }
}
