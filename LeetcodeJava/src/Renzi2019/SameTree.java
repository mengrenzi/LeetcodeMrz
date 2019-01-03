package Renzi2019;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 15:48 2019/1/3
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class SameTree {
}

class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        else if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        return isSameTree ( p.left, q.left ) && isSameTree ( p.right, q.right );
    }
}