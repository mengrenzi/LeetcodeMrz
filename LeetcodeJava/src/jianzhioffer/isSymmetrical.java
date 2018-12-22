package jianzhioffer;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 14:34 2018/12/22
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class isSymmetrical {
    boolean isSymmetrical(TreeNode pRoot) {
        if(pRoot == null) return false;
        return isSymmetrical ( pRoot.left, pRoot.right );
    }

    boolean isSymmetrical(TreeNode left, TreeNode right) {
        if(left == null && right == null) {return true;}

        if( left == null
                || right == null
                || left.val != right.val) {
            return false;
        }

        return isSymmetrical ( left.left, right.right ) && isSymmetrical ( left.right, right.left );
    }
}
