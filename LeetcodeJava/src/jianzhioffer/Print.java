package jianzhioffer;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 14:53 2018/12/22
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class Print {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        if(pRoot == null) return null;
        ArrayList<ArrayList<Integer>> result = new ArrayList <> (  );
        LinkedList<TreeNode> queue = new LinkedList <> (  );
        queue.offer ( pRoot );
        int length = 1;
        while(!queue.isEmpty ()) {
            ArrayList<Integer> x = new ArrayList<> (  );
            for(int i = 0; i< length; i++) {
                TreeNode tmp = queue.pop ();
                x.add ( tmp.val );
                if(tmp.left != null)
                {
                    queue.offer ( tmp.left );
                }
                if(tmp.right != null) {
                    queue.offer ( tmp.right );
                }
            }
            result.add ( x );
            length = queue.size ();
        }
        return result;
    }
}
