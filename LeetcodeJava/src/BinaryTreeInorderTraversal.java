import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 23:19 2018/9/26
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution094 {
    public List<Integer> inorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList <Integer> (  );
        if(root == null) return result;
        inorderTraversal (root, result);
        return result;
    }

    private void inorderTraversal(TreeNode node, LinkedList<Integer> list) {
        if(node == null) return;
        inorderTraversal ( node.left, list );
        list.add(node.val);
        inorderTraversal ( node.right, list );
    }
}

public class BinaryTreeInorderTraversal {
}
