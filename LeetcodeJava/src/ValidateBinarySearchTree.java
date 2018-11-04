/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 11:51 2018/11/4
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution098 {
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        return helper ( root, null, null );
    }

    public boolean helper (TreeNode root, Integer max, Integer min) {
        if(root == null) return true;
        if((max != null && root.val >= max) || (min != null && root.val <= min)) {
            return false;
        }
        Boolean left = helper (root.left, root.val, min);
        Boolean right = helper (root.right, max, root.val);
        return left && right;
    }
}

public class ValidateBinarySearchTree {

}
