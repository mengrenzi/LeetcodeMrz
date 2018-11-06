/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 9:51 2018/11/6
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class isSymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return false;
        return help ( root.left, root.right );
    }

    boolean help(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        return (left.val == right.val) && help ( left.left, right.right ) && help ( left.right, right.left );
    }
}
