package Renzi2019;

import java.util.TreeSet;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 15:37 2019/1/2
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class IsUnivalTree {
    public boolean isUnivalTree(TreeNode root) {
        int val = root.val;
        isUnivalTree ( root, val );
        return isUnivalTree ( root.left, val ) && isUnivalTree ( root.right, val );
    }

    public boolean isUnivalTree (TreeNode root, final int count){
        if(root == null) return true;
        if(root.val != count) return false;
        return isUnivalTree ( root.left, count ) && isUnivalTree ( root.right, count );
    }

}
