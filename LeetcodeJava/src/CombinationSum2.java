import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 15:28 2018/10/7
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution040 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort (candidates);
        List<List<Integer>> result = new LinkedList <> (  );
        help ( result, candidates, new ArrayList <Integer> (  ), 0, 0, target );
        return result;
    }

    void help(List<List<Integer>> result, int[] candidates, List<Integer> singleSol, int start, int sum, int target){
        if(sum == target) {
            if(!result.contains ( singleSol ))
                result.add (new ArrayList<> ( singleSol ));
            return;
        }else if(sum> target){
            return;
        }else{
            for(int i = start; i<candidates.length; i++){
                /**
                 * i> start 是判断 加入singleSol的元素是排除两个[1,2,5]\[1,2,5]的情况
                 * 可以去掉非第一次出现的情况
                 **/

                if(i > start && candidates[i] == candidates[i-1]) continue;
                singleSol.add ( candidates[i] );
                help ( result, candidates, singleSol, i+1, sum + candidates[i], target );
                singleSol.remove ( singleSol.size () - 1 );
            }
        }
    }

    public static void main(String[] args) {
        Solution040 mysolution = new Solution040 ();
        int[] array = {10,1,2,7,6,1,5};
        System.out.println ( mysolution.combinationSum2 ( array, 8) );
    }

}

public class CombinationSum2 {
}
