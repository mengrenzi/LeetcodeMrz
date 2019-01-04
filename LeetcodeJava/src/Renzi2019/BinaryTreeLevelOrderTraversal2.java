package Renzi2019;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 21:30 2019/1/3
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class BinaryTreeLevelOrderTraversal2 {
}

class Solution107 {
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> lists = new LinkedList<> (  );
        LinkedList<TreeNode> queue = new LinkedList <> (  );
        if(root == null) return lists;
        queue.add ( root );

        while(!queue.isEmpty ()) {
            LinkedList<Integer> list = new LinkedList <> ();
            int len = queue.size ();
            for(int i = 0; i< len; i++) {
                TreeNode node = queue.poll ();
                list.add ( node.val );
                if(node.left != null) {
                    queue.add ( node.left );
                }
                if(node.right != null) {
                    queue.add ( node.right );
                }
            }
            lists.push ( list );
        }
        return lists;
    }
}