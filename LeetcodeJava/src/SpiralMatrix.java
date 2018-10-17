import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 20:25 2018/10/17
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution054 {
    public List<Integer> spiralOrder(int[][] matrix) {
        LinkedList<Integer> result = new LinkedList<Integer> (  );
        if(matrix.length == 0) return result;
        int bot = matrix.length - 1, top = 0, left = 0, right = matrix[0].length - 1;
        while(bot >= top && right >= left){
            for(int i = left; i< right; i++){result.add(matrix[top][i]);}
            for(int i = top; i< bot; i++){result.add(matrix[i][right]);}
            for(int i = right; i> left; i--){result.add(matrix[bot][i]);}
            for(int i = bot; i> top; i--){result.add(matrix[i][left]);}
            top++; left++; right--; bot--;
        }

        if(left == right) {
            for(int i = top; i< bot; i++){
                result.add ( matrix[i][0] );
            }
        }else if(top == bot){
            for(int i = left; i< right; i++){
                result.add ( matrix[0][i] );
            }
        }
        return result;
    }
}

public class SpiralMatrix {
}
