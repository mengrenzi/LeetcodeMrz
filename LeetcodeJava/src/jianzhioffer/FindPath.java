package jianzhioffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 12:21 2018/12/24
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class FindPath {
    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList <> (  );

        FindPath ( root, target, 0, new ArrayList <Integer>(), result );
        Collections.sort ( result, new Comparator <ArrayList <Integer>> () {
            @Override
            public int compare(ArrayList <Integer> o1, ArrayList <Integer> o2) {
                return o2.size() - o1.size ();
            }
        } );

        return result;
    }

    static void FindPath(TreeNode root, int target, int count, ArrayList<Integer> x, ArrayList<ArrayList<Integer>> result) {
        if(root == null) {
            return;
        }
        x.add ( root.val );
        count += root.val;
        if(root.left == null || root.right == null){
            if(target == count) result.add ( x );
        }

        FindPath ( root.left, target, count, new ArrayList <Integer> ( x ), result );
        FindPath ( root.right, target, count, new ArrayList <Integer> ( x ), result );
    }

    public static void main(String[] args) {
        TreeNode x = new TreeNode ( 10 );
        x.left = new TreeNode ( 5 );
        x.right = new TreeNode ( 12 );
        x.left.left = new TreeNode ( 4);
        x.left.right = new TreeNode ( 7 );


        for (ArrayList<Integer> alist: FindPath (x, 22)) {
            System.out.println ( alist );
        }
    }

}
