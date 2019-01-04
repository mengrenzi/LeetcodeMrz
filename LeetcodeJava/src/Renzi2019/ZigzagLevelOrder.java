package Renzi2019;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 19:54 2019/1/3
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class ZigzagLevelOrder {
}

class Solution103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        LinkedList <List<Integer>> lists = new LinkedList <>();
        boolean leftToRight = true;
        if(root == null) return lists;
        LinkedList<TreeNode> queue = new LinkedList <> (  );
        queue.add ( root );

        while(!queue.isEmpty ()) {
            int len = queue.size ();
            LinkedList<Integer> list = new LinkedList <> (  );

            for(int i = 0; i< len; i++) {
                if (leftToRight) {
                    TreeNode tree = queue.poll ();
                    list.add ( tree.val );
                    if(tree.left != null) {
                        queue.add ( tree.left );
                    }
                    if(tree.right != null) {
                        queue.add ( tree.right );
                    }
                }else {
                    TreeNode tree = queue.removeLast ();
                    list.add ( tree.val );
                    if(tree.right != null) {
                        queue.addFirst ( tree.right );
                    }
                    if(tree.left != null) {
                        queue.addFirst ( tree.left );
                    }
                }
            }
            leftToRight = !leftToRight;
            lists.add ( list );
        }

        return lists;

    }
}