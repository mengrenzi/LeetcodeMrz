package jianzhioffer;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 14:52 2018/12/22
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class PrintZ {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        if(pRoot == null) return null;
        ArrayList<ArrayList<Integer>> result = new ArrayList <> (  );
        LinkedList<TreeNode> queue = new LinkedList <> (  );
        queue.offer ( pRoot );
        Boolean leftFromRight = true;
        int length = 1;
        while(!queue.isEmpty ()) {
            ArrayList<Integer> x = new ArrayList<> (  );
            for(int i = 0; i< length; i++) {
                TreeNode tmp;
                if(leftFromRight) {
                    tmp = queue.pop ();
                    x.add ( tmp.val );
                    if(tmp.left != null)
                    {
                        queue.offer ( tmp.left );
                    }
                    if(tmp.right != null) {
                        queue.offer ( tmp.right );
                    }
                } else {
                    tmp = queue.remove ( queue.size () - 1);
                    x.add ( tmp.val );
                    if(tmp.right != null) {
                        queue.offerFirst ( tmp.right );
                    }
                    if(tmp.left != null)
                    {
                        queue.offerFirst ( tmp.left );
                    }
                }
            }
            leftFromRight = !leftFromRight;
            result.add ( x );
            length = queue.size ();
        }
        return result;
    }
}
