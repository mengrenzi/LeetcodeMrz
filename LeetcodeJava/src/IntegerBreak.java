/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 14:44 2018/12/23
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class IntegerBreak {
}

class Solution343 {
    public static int integerBreak(int n) {
        if(n < 2) return -1;
        int[] result = new int[n + 1];
        result[0] = 0;
        result[1] = 1;
        result[2] = 1;

        for(int i = 3; i<= n; i++) {
            for(int j = 1; j <= ((i + 1) /2); j++) {
                result[i] = Math.max ( result[i],
                        Math.max ( result[j], j ) * Math.max ( result[i - j], i - j ) )  ;
            }
        }
        return result[n];
    }


    public static void main(String[] args) {
        System.out.println ( integerBreak ( 5 ) );
    }
}