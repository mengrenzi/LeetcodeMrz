package jianzhioffer;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 17:02 2018/12/18
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class HasSubtree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null || root2 == null) return false;
        LinkedList<TreeNode> l1 = new LinkedList<> (  );
        LinkedList<TreeNode> lRoot1 = new LinkedList<> (  );
        l1.add ( root1 );

        while(!l1.isEmpty ()) {
            TreeNode tmp = l1.pop ();
            lRoot1.add ( tmp );
            if(tmp.right != null) {
                l1.add ( tmp.right );
            }
            if(tmp.left != null) {
                l1.add ( tmp.left );
            }
        }

        for(TreeNode x1 : lRoot1){
            if(isSame ( x1, root2 )){
                return true;
            }

        }
        return false;
    }

    public boolean isSame(TreeNode r1,TreeNode r2) {
        if(r1 == null && r2 == null) return true;
        if(r2 == null) return true;
        if(r1 == null || r1.val != r2.val) return false;
        return isSame (r1.right, r2.right) && isSame (r1.left, r2.left);
    }

}
