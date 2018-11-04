import java.util.Map;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 16:27 2018/11/1
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution073 {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        boolean[] rowBool = new boolean[row];
        boolean[] columnBool = new boolean[column];

        for(int i = 0; i< row; i++) {
            for(int k = 0; k< column;k++) {
                if(matrix[i][k] == 0){
                    rowBool[i] = true;
                    columnBool[k] = true;
                }
            }
        }

        for(int i = 0; i< row; i++) {
            if(rowBool[i]){
                for(int k =0; k< column; k++) {
                    matrix[i][k] = 0;
                }
            }
        }

        for(int k = 0; k< column; k++) {
            if(columnBool[k]){
                for(int i =0; i< row; i++) {
                    matrix[i][k] = 0;
                }
            }
        }

    }
}

public class SetMatrixZeros {
}
