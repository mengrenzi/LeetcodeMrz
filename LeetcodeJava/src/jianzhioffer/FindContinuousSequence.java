package jianzhioffer;

import java.util.ArrayList;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 11:08 2019/1/5
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList <> (  );

        int small = 1;
        int big = small + 1;

        while(small < (sum + 1)/2 ) {
            int tmp = 0;
            for(int i = small; i<= big; i++) {
                tmp += i;
            }
            if(tmp == sum) {
                ArrayList<Integer> list = new ArrayList <> (  );
                for(int i = small; i<= big; i++) list.add ( i );
                lists.add ( list );
                big++;
                small++;
            }else if(tmp > sum) {
                small++;
            }else {
                big++;
            }
        }

        return lists;
    }
}
