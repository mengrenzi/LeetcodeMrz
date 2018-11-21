import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 19:25 2018/11/21
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class BinaryTreeLevelOrderTraversal2 {
}

class Solution107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<> (  );
        if(root == null) return result;
        LinkedList<TreeNode> queue = new LinkedList <> (  );
        queue.offer ( root );

        while (!queue.isEmpty ()) {
            int size = queue.size ();
            LinkedList<Integer> list = new LinkedList <> (  );
            for(int i = 0; i< size; i++) {
                TreeNode node = queue.pop ();
                list.add ( node.val );
                if(node.left != null) queue.offer ( node.left );
                if(node.right != null) queue.offer ( node.right );
            }
            result.add(list);
        }

        int size = result.size ();
        List<List<Integer>> resultBottom = new LinkedList<> (  );

        for(int i = 0; i< result.size (); i++) {
            resultBottom.add ( result.remove ( size - i - 1) );
        }

        return resultBottom;
    }
}