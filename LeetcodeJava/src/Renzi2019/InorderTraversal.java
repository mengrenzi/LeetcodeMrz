package Renzi2019;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 21:27 2019/1/3
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class InorderTraversal {
}

class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        LinkedList<Integer> list = new LinkedList <> (  );
        inorderTraversal(root, list);
        return list;
    }

    public void inorderTraversal(TreeNode root, List<Integer> list) {
        if(root == null) return;
        inorderTraversal ( root.left, list );
        list.add ( root.val );
        inorderTraversal ( root.right, list );
    }

    public List<Integer> inorderTraversal2(TreeNode root) {
        LinkedList <Integer> list = new LinkedList <> ();
        Stack <TreeNode> stack = new Stack <> ();
        TreeNode p = root;

        while (!stack.isEmpty () || p != null) {
            if(p != null) {
                stack.push ( p );
                p = p.left;
            }else {
                TreeNode node = stack.pop ();
                list.add ( node.val );
                p = node.right;
            }
        }
        return list;
    }
}