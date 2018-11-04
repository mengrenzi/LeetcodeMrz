import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 15:15 2018/11/1
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null && q == null) return false;
        if(p.val == q.val)
            return isSameTree ( p.left, q.left ) && isSameTree ( p.right, q.right );
        return false;
    }
}

public class SameTree {
}
