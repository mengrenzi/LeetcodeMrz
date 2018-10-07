import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 17:46 2018/10/7
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution079 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort ( nums );
        List<List<Integer>> result = new LinkedList<> (  );
        dfs(result, new ArrayList<Integer> (  ),nums, 0);
        return result;
    }

    void dfs(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start){
        result.add ( new ArrayList <> ( tempList ) );
        for (int i = start; i < nums.length; i++) {
            if(i > start && nums[i - 1] == nums[i]){
                continue;
            }
            tempList.add ( nums[i] );
            dfs ( result, tempList, nums, i + 1 );
            tempList.remove ( tempList.size () - 1 );
        }
        return;
    }

    public static void main(String[] args) {
        Solution079 mysolution = new Solution079 ();
        int[] array = {1,2,2};
        System.out.println ( mysolution.subsetsWithDup (array) );
    }
}

public class Subsets2 {
}
