/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 19:43 2018/11/21
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class ConstructBinaryTreefromPreorderandInorderTraversal {
}

class Solution105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0 || preorder.length != inorder.length) return null;
        return constructBinaryTreefromPreorderandInorderTraversal(preorder, inorder, 0, 0, preorder.length - 1);
    }

    public TreeNode constructBinaryTreefromPreorderandInorderTraversal(int[] preorder, int[] inorder, int pre_st, int in_st, int in_end) {
        if(pre_st > preorder.length || in_st > in_end) return null;
        TreeNode current = new TreeNode ( preorder[pre_st] );
        int i = in_st;
        while(i <= in_end) {
            if(inorder[i] == preorder[pre_st]) break;
            i++;
        }

        current.left = constructBinaryTreefromPreorderandInorderTraversal(preorder, inorder, pre_st + 1, in_st, i - 1);
        current.right = constructBinaryTreefromPreorderandInorderTraversal(preorder, inorder, pre_st+(i - in_st + 1), i + 1, in_end);

        return current;
    }

}
