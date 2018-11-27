package jianzhioffer;

import java.util.ArrayList;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 17:55 2018/11/25
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class JumpFloorII {
    public int JumpFloorII(int target) {
        ArrayList<Integer> step = new ArrayList <> (  );
        step.add ( 0 );
        step.add ( 1 );
        step.add ( 2 );

        for (int i = 3; i<= target; i++) {
            int sum = 1;
            for(int j = 1; j<= i; j++) {
                sum += step.get ( i );
            }
            step.add ( sum );
        }
        return step.get ( target );
    }
}
