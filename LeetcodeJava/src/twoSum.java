import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 9:45 2018/9/13
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap <Integer, Integer> (  );

        for(int i = 0; i< numbers.length; i++){
            if(map.containsKey ( target - numbers[i] )){
                result[0] = map.get(target - numbers[i]);
                result[1] = i;
                return result;
            }
            map.put ( numbers[i],i );

        }

        return result;
    }
}

public class twoSum {
    public static void main(String[] args){
        int[] x = {2,7,11,15};
        Solution mysolution = new Solution ();
        int[] result = mysolution.twoSum ( x,9 );
        for(int i = 0; i< 2; i++){
            System.out.println (result[i]);
        }
    }
}
