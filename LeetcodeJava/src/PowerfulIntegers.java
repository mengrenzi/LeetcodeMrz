import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 10:32 2019/1/6
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class PowerfulIntegers {
}

class Solution970 {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        HashSet<Integer> set = new HashSet <> (  );
        ArrayList<Integer> lists = new ArrayList <> (  );
        if(bound == 0) return lists;

        for(int i = 0; i< bound; i++) {
            for(int j = 0; j< bound; j++) {
                int sum = (int) (Math.pow ( x, i ) + Math.pow ( y, j ));
                if(sum > bound) break;
                else set.add ( sum );
            }
            if(Math.pow ( x, i) > bound) break;
        }

        return new ArrayList <> ( set );
    }
}
