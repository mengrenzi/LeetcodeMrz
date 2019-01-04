package Renzi2019;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 19:55 2019/1/3
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class SymmetricTree {
}

class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        return root == null && isMirror ( root.left, root.right );
    }

    public boolean isMirror(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        return (p.val==q.val) && isMirror(p.left,q.right) && isMirror(p.right,q.left);
    }
}