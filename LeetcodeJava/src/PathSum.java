import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 20:30 2018/11/21
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class PathSum {
}

class Solution112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        List<Integer> treeSum = new LinkedList <> (  );
        sumAll(treeSum, 0, root);
        return treeSum.contains ( sum );
    }

    private void sumAll(List<Integer> treeSum, int sum, TreeNode root) {
        sum += root.val;
        if(root.right == null && root.left == null) {
            treeSum.add ( sum );
            return;
        }

        if(root.left != null) sumAll ( treeSum, sum, root.left );
        if(root.right != null) sumAll ( treeSum, sum, root.right );
    }

}
