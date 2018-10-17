import java.util.Arrays;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 21:13 2018/10/17
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] results = new int[n][n];
        if(n == 0) return results;
        int bot = n - 1, top = 0, left = n - 1, right = 0;

        while(bot > top && )

        while(bot >= top && right >= left){
            for(int i = left; i< right; i++){result.add(matrix[top][i]);}
            for(int i = top; i< bot; i++){result.add(matrix[i][right]);}
            for(int i = right; i> left; i--){result.add(matrix[bot][i]);}
            for(int i = bot; i> top; i--){result.add(matrix[i][left]);}
            top++; left++; right--; bot--;
        }

    }
}

public class SpiralMatrix2 {

}
