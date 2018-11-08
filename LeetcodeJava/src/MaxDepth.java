/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 10:13 2018/11/6
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if(root == null)  return 0;
        return Math.max(maxDepth (root.left), maxDepth (root.right)) + 1;
    }

}
