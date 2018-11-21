import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 20:51 2018/11/21
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class SingleNumber {
}

class Solution136 {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer> ();
        for(int i: nums){
            if(!set.contains(i)) set.add(i);
            else set.remove(i);
        }
        Iterator it = set.iterator();
        return (int)it.next();

    }
}