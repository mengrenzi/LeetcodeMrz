package Renzi2019;

import java.util.LinkedList;
import java.util.List;

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
}