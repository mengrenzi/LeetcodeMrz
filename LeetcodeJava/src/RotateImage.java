/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 12:57 2018/10/8
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution048 {
    public void rotate(int[][] matrix) {
        int temp;
        for(int i = 0; i< matrix.length; i++){
            for(int j = i+1; j< matrix.length; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i< matrix.length; i++) {
            for(int j = 0; j< matrix.length/2; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - j - 1];
                matrix[i][matrix.length - j - 1] = temp;
            }
        }
    }
}

public class RotateImage {

}
