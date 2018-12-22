package jianzhioffer;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 14:21 2018/12/22
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class TreeDepth {
    public int TreeDepth(TreeNode root) {
        if(root == null) {return 0;}
        return TreeDepth ( root.left ) > TreeDepth ( root.right ) ? TreeDepth ( root.left ) + 1: TreeDepth ( root.right ) + 1;
    }
}
