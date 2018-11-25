package jianzhioffer;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 8:55 2018/11/25
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class SearchInDoubleDimensionalArray {
}

class Solution0001 {
    public boolean Find(int target, int [][] array) {
        if(array.length == 0 || array[0].length == 0 || array[0][0] > target
                || array[array.length - 1][array[0].length - 1] < target) return false;        int i,j=0;
        for(i=0;i<array.length;i++)
        {
            if(array[i][0]<target)
            {
                for(j=0;j<array[i].length;j++)
                {
                    if(array[i][j]==target)
                        return true;
                    if(array[i][j]>target)
                        break;
                }
            }
            if(array[i][0]==target)
                return true;
            if(array[i][0]>target)
                break;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] x = {{1,2,8,9}, {4,7,10, 13}};
        Solution0001 myS = new Solution0001 ();
        System.out.println(myS.Find ( 7 , x ));
    }
}