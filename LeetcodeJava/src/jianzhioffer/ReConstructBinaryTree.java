package jianzhioffer;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 11:42 2018/11/25
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class ReConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length == 0 || pre.length != in.length) return null;
        return treeHelper ( pre, in, 0, 0, in.length  - 1 );
    }

    TreeNode treeHelper(int[] pre, int[] in, int pre_st, int in_st, int in_end){
        if(in_end < in_st) return null;
        TreeNode root = new TreeNode ( pre[pre_st] );

        int x = in_st;
        for(int i = in_st; i<= in_end; i++) {
            if(pre[pre_st] == in[i]) {
                x = i;
                break;
            }
        }

        root.left = treeHelper ( pre, in, pre_st + 1, in_st, x  - 1 );
        root.right = treeHelper ( pre, in, pre_st + (x  - in_st+ 1), x + 1, in_end );

        return root;
    }
}
