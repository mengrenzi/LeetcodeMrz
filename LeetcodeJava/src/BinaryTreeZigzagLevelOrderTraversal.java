import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 18:47 2018/11/21
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */


class Solution103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList <> (  );
        if(root == null) return result;
        LinkedList<TreeNode> list = new LinkedList <> (  );
        boolean leftToRight = true;
        list.add ( root );
        while(!list.isEmpty ()) {
            int size = list.size ();
            List<Integer> curList = new LinkedList <> (  );
            if(leftToRight){
                for(int i = 0; i< size; i++) {
                    TreeNode curr = list.remove ( 0 );
                    curList.add ( curr.val );
                    if(curr.left != null) list.add ( curr.left );

                    if(curr.right != null) list.add ( curr.right );
                }
            }else {
                for(int i = 0; i< size; i++) {
                    TreeNode curr = list.remove ( list.size() - 1 );
                    curList.add ( curr.val );
                    if(curr.right != null) list.add ( 0, curr.right );
                    if(curr.left != null) list.add ( 0, curr.left );
                }
            }
            result.add ( curList );
            leftToRight = !leftToRight;
        }
        return result;
    }
}

public class BinaryTreeZigzagLevelOrderTraversal {


}
