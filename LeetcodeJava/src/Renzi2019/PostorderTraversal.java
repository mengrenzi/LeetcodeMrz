package Renzi2019;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 15:21 2019/1/5
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class PostorderTraversal {
}

class Solution145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> list = new LinkedList <> (  );
        Stack<TreeNode> stack = new Stack <> ();
        TreeNode p = root;

        while(!stack.isEmpty () || p != null) {
            if(p != null) {
                stack.push ( p );
                list.addFirst ( p.val );
                p = p.right;
            }else {
                TreeNode tree = stack.pop ();
                p = tree.left;
            }
        }
        return list;
    }
}