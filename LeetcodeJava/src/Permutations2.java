import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 16:44 2018/10/7
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution047 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<> (  );
        Arrays.sort ( nums );
        dfs(result, new ArrayList<Integer> (  ),nums, new boolean[nums.length]);
        return result;
    }

    void dfs(List<List<Integer>> result, List<Integer> tempList,int[] nums, boolean[] used){
        if(tempList.size () > nums.length - 1){
/*
            if(!result.contains (tempList))
*/
                result.add ( new ArrayList <> ( tempList ) );
            return;
        }else {
            for (int i = 0; i < nums.length; i++) {
                if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1]) {
                    continue;
                }
                tempList.add ( nums[i] );
                used[i] = true;
                dfs ( result, tempList, nums, used);
                tempList.remove ( tempList.size () - 1 );
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Solution047 mysolution = new Solution047 ();
        int[] array = {1,1,2};
        System.out.println ( mysolution.permute (array) );
    }
}
public class Permutations2 {
}
