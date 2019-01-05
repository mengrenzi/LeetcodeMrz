package jianzhioffer;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 10:34 2019/1/4
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class Convert {
    public static TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null) return null;
        LinkedList<TreeNode> list = new LinkedList <> (  );
        inorderTraversal(pRootOfTree, list);
        TreeNode root = list.pop ();
        TreeNode pre = root;
        root.left = null;

        while(!list.isEmpty ()) {
            TreeNode tree = list.pop ();
            pre.right = tree;
            tree.left = pre;
            pre = pre.right;
        }
        pre.right = null;
        return root;
    }

    public static void inorderTraversal(TreeNode root, List<TreeNode> list) {
        if(root == null) return;
        inorderTraversal ( root.left, list );
        list.add ( root );

        inorderTraversal ( root.right, list );
    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode ( 10 );
        tree.left = new TreeNode ( 6 );
        tree.right = new TreeNode ( 14 );
        tree.left.left = new TreeNode ( 4 );
        tree.left.right = new TreeNode ( 8 );
        tree.right.left = new TreeNode ( 12 );
        tree.right.right = new TreeNode ( 16 );
        Convert ( tree );
    }

}

