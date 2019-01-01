package Renzi2019;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 20:24 2018/12/27
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class Permutations2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> lists = new LinkedList<> (  );
        if(nums.length == 0) return lists;
        dfs ( lists, new LinkedList <Integer> (  ), nums);
        return lists;
    }

    private void dfs(List<List<Integer>> lists, List<Integer> list, int[] nums) {
        if(list.size () == nums.length) {
            if(!lists.contains ( list ))
                lists.add ( new LinkedList <Integer> ( list ) );
            return;
        }

        for (int i = 0; i< nums.length; i++) {
            if(list.contains ( nums[i] )) {continue;}
            list.add ( nums[i] );
            dfs(lists, list, nums);
            list.remove ( list.size () - 1 );
        }
    }
}
