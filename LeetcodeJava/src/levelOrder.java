import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 10:53 2018/11/7
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class levelOrder {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList <> (  );
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
        return result;
    }
}
