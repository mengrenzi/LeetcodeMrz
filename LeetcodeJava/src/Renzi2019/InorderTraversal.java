package Renzi2019;

import java.util.LinkedList;
import java.util.List;

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
}