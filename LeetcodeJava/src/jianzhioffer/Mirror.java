package jianzhioffer;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 17:53 2018/12/18
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class Mirror {
    public void Mirror(TreeNode root) {
        if(root == null) return;
        TreeNode x = root.right;
        root.right = root.left;
        root.left = x;

        if(root.right != null) Mirror ( root.right );
        if(root.left != null) Mirror ( root.left );
    }
}