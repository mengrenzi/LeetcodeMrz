package Renzi2019;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 10:19 2019/1/4
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class PreorderTraversal {
}

class Solution144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<Integer> list = new LinkedList <> (  );
        preorderTraversal ( root, list );
        return list;
    }

    public void preorderTraversal(TreeNode root, List<Integer> list) {
        if(root == null) return;
        list.add ( root.val );
        preorderTraversal ( root.left, list);
        preorderTraversal ( root.right, list);
    }

    public List<Integer> preorderTraversal2(TreeNode root) {
        LinkedList<Integer> list = new LinkedList <> (  );
        Stack<TreeNode> stack = new Stack <> ();
        TreeNode p = root;

        while(!stack.isEmpty () || p != null) {
            if(p != null) {
                stack.push ( p );
                list.add ( p.val );
                p = p.left;
            }else {
                p = stack.pop ().right;
            }
        }
        return list;
    }
}