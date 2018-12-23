/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 15:22 2018/12/23
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class NumSquares {
}

class Solution279 {
    public int numSquares(int n) {
        if(n < 1) return -1;
        int[] result = new int[n + 1];
        for(int i = 0; i< n + 1; i++) {
            result[i] = Integer.MAX_VALUE;
        }

        for(int i = 1; i * i< n; i++) {
            result[i*i] = 1;
        }
        for(int i = 1; i<= n; i++) {
            for(int j = 1; j <= (i+1)/2; j++) {
                if(i - j < 1) {break;}
                result[i] = Math.min ( result[i], result[i-j] + result[j]);
            }
        }
        return result[n];
    }

    public static void main(String[] args) {

    }
}