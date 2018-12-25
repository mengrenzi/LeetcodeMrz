package jianzhioffer;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 14:26 2018/12/22
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class FindNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array.length == 0) return;
        HashMap<Integer, Integer> map = new HashMap <> (  );

        for (int anArray : array) {
            if (!map.containsKey ( anArray ))
                map.put ( anArray, 1 );
            else {
                map.put ( anArray, map.get ( anArray ) + 1 );
            }
        }
        num1[0] = -1;

        for (int anArray : array) {
            if(map.get ( anArray ) == 1) {
                if (num1[0] == -1) {
                    num1[0] = anArray;
                } else {
                    num2[0] = anArray;
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        FindNumsAppearOnce f = new FindNumsAppearOnce ();
        int[] array = {2,4,3,6,3,2,5,5};
        f.FindNumsAppearOnce ( array, new int[0], new int[0] );
    }
}
