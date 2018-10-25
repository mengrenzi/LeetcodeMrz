/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 0:24 2018/10/19
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution063 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];

        for(int i = 0; i < obstacleGrid.length; i++){
            if(obstacleGrid[i][0] == 1) break;
            dp[i][0] = 1;
        }

        for(int j = 1; j< obstacleGrid[0].length; j++){
            if(obstacleGrid[0][j] == 1) break;
            dp[0][j] = 1;
        }

        for(int i = 1; i< obstacleGrid.length; i++){
            for(int j = 1; j< obstacleGrid[0].length; j++){
                dp[i][j] = obstacleGrid[i][j] == 1 ? 0
                        : dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }

    public static void main(String[] args) {

    }
}

public class UniquePath2 {

}
