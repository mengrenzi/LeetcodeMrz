package jianzhioffer;

import java.util.ArrayList;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 22:50 2019/1/4
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class IsBalanced {
    public boolean IsBalanced_Solution(TreeNode root) {
        return maxDepth ( root ) - minDepth ( root ) <= 1;
    }

    public int maxDepth(TreeNode root) {
        if(root == null) {return 0;}
        return Math.max ( maxDepth ( root.left ), maxDepth ( root.right )) + 1;
    }

    public int minDepth(TreeNode root) {
        if(root == null) {return 0;}
        return Math.min ( minDepth ( root.left ), minDepth ( root.right )) + 1;
    }
}
