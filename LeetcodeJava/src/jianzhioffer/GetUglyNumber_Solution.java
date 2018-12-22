package jianzhioffer;

import java.util.Stack;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 11:28 2018/12/22
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class GetUglyNumber_Solution {
    public static int GetUglyNumber_Solution(int index) {
        if(index < 7) return index;
        int multiply2 = 0;
        int multiply3 = 0;
        int multiply5 = 0;
        int[] x = new int[index];
        x[0] = 1;

        for(int i = 1; i< index; i++) {
            x[i] = Math.min ( x[multiply2] * 2, Math.min ( x[multiply3] * 3, x[multiply5] * 5 ) );
            if(x[multiply2] * 2 == x[i]) {
                multiply2++;
            }
            if(x[multiply3] * 3 == x[i]) {
                multiply3++;
            }
            if(x[multiply5] * 5 == x[i]) {
                multiply5++;
            }
        }
        return x[index - 1];

    }

    public static void main(String[] args) {
        System.out.println ( GetUglyNumber_Solution(7) );
    }
}
