package Renzi2019;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 20:11 2019/1/3
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class BinaryTreeLevelOrderTraversal {
}

class Solution102 {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<List<Integer>> lists = new LinkedList <> (  );
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
                    queue.offer ( node.left );
                }
                if(node.right != null) {
                    queue.offer ( node.right );
                }
            }
            lists.add ( list );
        }
        return lists;
    }

    public static List<List<Integer>> levelOrder2(TreeNode root) {
        LinkedList<List<Integer>> lists = new LinkedList <> (  );
        LinkedList<TreeNode> queue = new LinkedList <> (  );
        if(root == null) return lists;
        queue.push ( root );

        while(!queue.isEmpty ()) {
            LinkedList<Integer> list = new LinkedList <> ();
            int len = queue.size ();
            for(int i = 0; i< len; i++) {
                TreeNode node = queue.poll ();
                list.add ( node.val );
                if(node.left != null) {
                    queue.push ( node.left );
                }
                if(node.right != null) {
                    queue.push ( node.right );
                }
            }
            lists.add ( list );
        }
        return lists;
    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode ( 3 );
        tree.left = new TreeNode ( 9 );
        tree.right = new TreeNode ( 20 );
        tree.right.left = new TreeNode ( 15 );
        tree.right.right = new TreeNode ( 7 );

        levelOrder ( tree );
        levelOrder2 ( tree );
    }
}
