import java.util.Arrays;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 21:13 2018/10/17
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution059 {
    public int[][] generateMatrix(int n) {
        int[][] results = new int[n][n];
        if(n == 0) return results;
        int bot = n - 1, top = 0, right = n - 1, left = 0, count = 1;


        while(bot > top && right > left){
            for(int i = left; i< right; i++){results[top][i] = count; count++;}
            for(int i = top; i< bot; i++){results[i][right] = count; count++;}
            for(int i = right; i> left; i--){results[bot][i] = count; count++;}
            for(int i = bot; i> top; i--){results[i][left] = count; count++;}
            top++; left++; right--; bot--;
        }

        if(right == left){
            results[top][left] = count;
        }

        return results;
    }

    public static void main(String[] args) {
        Solution059 mysolution = new Solution059 ();
        int[][] x = mysolution.generateMatrix ( 3 );
        for( int[] a : x){
            for(int b : a){
                System.out.println ( b );
            }
        }
    }
}

public class SpiralMatrix2 {

}
