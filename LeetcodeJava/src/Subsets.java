import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 17:32 2018/10/7
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution078 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new LinkedList<> (  );
        dfs(result, new ArrayList<Integer> (  ),nums, 0);
        return result;
    }

    void dfs(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start){
        result.add ( new ArrayList <> ( tempList ) );
        for (int i = start; i < nums.length; i++) {
            tempList.add ( nums[i] );
            dfs ( result, tempList, nums, i + 1 );
            tempList.remove ( tempList.size () - 1 );
        }
        return;
    }

    public static void main(String[] args) {
        Solution078 mysolution = new Solution078 ();
        int[] array = {1,2,3};
        System.out.println ( mysolution.subsets (array) );
    }
}

public class Subsets {

}
