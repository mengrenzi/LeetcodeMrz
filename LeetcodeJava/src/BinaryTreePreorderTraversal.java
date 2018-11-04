import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 13:39 2018/11/1
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList <> (  );
        if(root == null) return result;
        preOrder ( root, result);
        return result;
    }

    public void preOrder(TreeNode root, LinkedList x){
        if(root == null) return;
        x.add ( root.val );
        preOrder ( root.left, x);
        preOrder ( root.right, x );
    }
}

public class BinaryTreePreorderTraversal {

}
