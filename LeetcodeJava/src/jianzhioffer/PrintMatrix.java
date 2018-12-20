package jianzhioffer;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 18:03 2018/12/18
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        if(matrix == null) return null;

        ArrayList<Integer> l1 = new ArrayList<> (  );
        int row = matrix.length;
        int col = matrix[0].length;
        if (row == 0 || col == 0)  return l1;
        int left = 0, top = 0, right = col - 1, bottom = row - 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                l1.add ( matrix[top][i] );
            }
            for (int i = top + 1; i <= bottom; i++) {
                l1.add ( matrix[i][right] );
            }
            for (int i = right - 1; i >= left; i--) {
                if(top == bottom) {
                    break;
                }
                l1.add ( matrix[bottom][i] );
            }
            for (int i = bottom - 1; i > top; i--) {
                if(right == left) {
                    break;
                }
                l1.add ( matrix[i][left] );
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return l1;
    }
}
