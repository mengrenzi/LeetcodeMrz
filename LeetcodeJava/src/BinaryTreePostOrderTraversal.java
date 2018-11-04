import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 13:44 2018/11/1
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList <> (  );
        if(root == null) return result;
        postOrder ( root, result);
        return result;
    }

    public void postOrder(TreeNode root, LinkedList x){
        if(root == null) return;
        postOrder ( root.left, x);
        postOrder ( root.right, x );
        x.add ( root.val );
    }
}

public class BinaryTreePostOrderTraversal {

}
