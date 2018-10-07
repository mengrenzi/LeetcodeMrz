import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 16:03 2018/10/7
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution046 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList <> (  );
        dfs(result, new ArrayList <Integer> (  ),nums, 0);
        return result;
    }

    void dfs(List<List<Integer>> result, List<Integer> tempList,int[] nums, int count){
        if(count > nums.length - 1){
            result.add ( new ArrayList <> ( tempList ) );
            return;
        }else {
            for (int i = 0; i < nums.length; i++) {
                if(tempList.contains ( nums[i] ))
                    continue;
                tempList.add ( nums[i] );
                dfs ( result, tempList, nums, count + 1);
                tempList.remove ( tempList.size () - 1 );
            }
        }
    }

    public static void main(String[] args) {
        Solution046 mysolution = new Solution046 ();
        int[] array = {1,2,3};
        System.out.println ( mysolution.permute (array) );
    }
}

public class Permutations {
}
