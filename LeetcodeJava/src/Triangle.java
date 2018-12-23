import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 14:33 2018/11/22
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class Triangle {
}

class Solution120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size () == 0)   return 0;
        int[] sumList = new int[triangle.size ()+1];

        for(int i= triangle.size() - 1; i>= 0; i--) {
            for(int j = 0; j< triangle.get ( i ).size(); j++) {
                sumList[j] = Math.min(sumList[j],sumList[j+1])+triangle.get(i).get(j);
            }
        }

        return sumList[0];
    }


    public int minimumTotal2(List<List<Integer>> triangle) {
        if(triangle.size () == 0)   return 0;
        int[] sumList = new int[triangle.size ()+1];
        for(int i = triangle.size () - 1; i >= 0; i-- ) {
            for(int j = 0; j < triangle.get ( i ).size (); j++) {
                sumList[j] = triangle.get ( i ).get ( j ) + Math.min( sumList[j] , sumList[j + 1]);
            }
        }


        return sumList[0];
    }
}


