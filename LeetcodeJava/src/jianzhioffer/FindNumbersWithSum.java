package jianzhioffer;

import java.util.ArrayList;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 11:38 2019/1/5
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        int j = array.length - 1, i = 0;
        ArrayList<Integer> list = new ArrayList <> (  );
        while(i < j) {
            if(array[i] + array[j] == sum) {
                list.add ( array[i] );
                list.add ( array[j] );
                break;
            }else if(array[i] + array[j] < sum) {
                i++;
            }else {
                j--;
            }
        }
        return list;
    }
}

