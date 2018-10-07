import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 10:01 2018/10/6
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */


class Solution039 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort ( candidates );
        List<List<Integer>> result = new ArrayList <> (  );
        help ( result, candidates, new ArrayList <Integer> (  ), 0, 0, target );
        return result;
    }

    void help(List<List<Integer>> result, int[] candidates, List<Integer> singleSol, int i, int sum, int target){
        if(sum == target) {
            /*
                不能直接add singleSol ，因为singleSol变化后会影响result中对应位置值的变化
                result.add ( singleSol);
            */
            result.add (new ArrayList <Integer> ( singleSol ));
            return;
        }else if(sum> target){
            return;
        }else{
            for(;i<candidates.length;i++){
                singleSol.add ( candidates[i] );
                help ( result, candidates, singleSol, i, sum + candidates[i], target );
                singleSol.remove ( singleSol.size () - 1 );
            }
        }
    }

    public static void main(String[] args) {
        Solution039 mysolution = new Solution039 ();
        int[] array = {2,3,6,7};
        System.out.println ( mysolution.combinationSum ( array, 7) );
    }
}

public class combinationSum {
}
