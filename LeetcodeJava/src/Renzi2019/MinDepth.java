package Renzi2019;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 10:30 2019/1/5
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class MinDepth {
}

class Solution111 {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int right = minDepth (root.right);
        int left = minDepth ( root.left );
        return (left == 0 || right == 0) ? left + right : Math.min ( right, left ) ;
    }
}