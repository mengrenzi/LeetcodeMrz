/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 14:41 2018/10/25
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution064 {
    public int minPathSum(int[][] grid) {
        int i,j;
        int[][] miniSum = new int[grid.length][grid[0].length];
        miniSum[0][0] = grid[0][0];


        // 1st column sum
        for(i = 1; i< grid.length; i++){
            miniSum[i][0] = miniSum[i - 1][0] + grid[i][0];
        }

        // 1st row sum
        for(i = 1; i< grid[0].length; i++){
            miniSum[0][i] = miniSum[0][i - 1] + grid[0][i];
        }

        for(i = 1; i< grid.length; i++) {
            for(j = 1; j< grid[0].length; j++){
                miniSum[i][j] = Math.min(miniSum[i - 1][j] , miniSum[i][j - 1]) + grid[i][j];
            }
        }

        return miniSum[grid.length - 1][grid[0].length - 1];
    }
}

public class MinimumPathSum {
}
