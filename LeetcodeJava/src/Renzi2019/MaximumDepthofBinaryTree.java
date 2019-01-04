package Renzi2019;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 9:47 2019/1/4
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class MaximumDepthofBinaryTree {
}

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max ( maxDepth ( root.left ), maxDepth ( root.right )) + 1;
    }
}