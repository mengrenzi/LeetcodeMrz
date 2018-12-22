package jianzhioffer;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 17:46 2018/12/21
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class NumberOf1Between1AndN_Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for(int i = 0; i<= n; i ++) {
            for(int tmp = i; tmp > 0; tmp = tmp / 10) {
                if(tmp % 10 == 1) {
                    count ++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        NumberOf1Between1AndN_Solution s = new NumberOf1Between1AndN_Solution ();
        s.NumberOf1Between1AndN_Solution ( 55 );
    }

}
