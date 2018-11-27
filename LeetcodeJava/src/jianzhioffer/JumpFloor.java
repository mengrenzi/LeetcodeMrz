package jianzhioffer;

import java.util.ArrayList;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 17:40 2018/11/25
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class JumpFloor {
    public int JumpFloor(int target) {
        ArrayList<Integer> step = new ArrayList <> (  );
        step.add ( 0 );
        step.add ( 1 );
        for(int i = 2; i<= target; i++) {
            step.add ( step.get ( i - 2 ) + step.get ( i - 1 ) );
        }
        return step.get ( target );
    }
}
