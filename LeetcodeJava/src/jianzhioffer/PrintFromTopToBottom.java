package jianzhioffer;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 11:25 2018/12/20
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList <> (  );
        ArrayList<Integer> res = new ArrayList <> (  );
        if(root == null) return res;

        queue.offer ( root );
        while(!queue.isEmpty ()) {
            int len = queue.size ();
            for(int i = 0; i< len; i++) {
                TreeNode x = queue.poll ();
                res.add ( x.val );
                if(x.left != null) queue.add ( x.left );
                if(x.right != null) queue.add ( x.right );
            }
        }

        return res;
    }

    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList <> (  );
        ArrayList<Integer> x = new ArrayList <> (  );
        queue.add (1);
        queue.add (2);
        queue.add (3);
        queue.add (4);
        System.out.println ( queue.pop () );
        System.out.println ( queue.poll () );

    }
}
