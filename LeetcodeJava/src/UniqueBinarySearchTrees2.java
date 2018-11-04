import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 13:51 2018/11/1
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution095 {
    public List<TreeNode> generateTrees(int n) {
        return uniqueBinarySearchTrees(1,n);
    }

    private LinkedList<TreeNode> uniqueBinarySearchTrees(int min, int max) {
        LinkedList<TreeNode> results = new LinkedList <> (  );
        if(min> max){ return results; }
        for(int i = min; i<=max ;i++) {
            List<TreeNode> leftNode = uniqueBinarySearchTrees ( min, i - 1 );
            List<TreeNode> rightNode = uniqueBinarySearchTrees ( i + 1, max );
            if(leftNode.size () == 0 && rightNode.size () == 0){
                results.add(new TreeNode ( i ));
            }else if(leftNode.size () == 0) {
                for(TreeNode right : rightNode) {
                     TreeNode root = new TreeNode (i);
                     root.right = right;
                     results.add ( root );
                }
            }else if(rightNode.size () == 0) {
                for(TreeNode left : leftNode) {
                    TreeNode root = new TreeNode (i);
                    root.left = left;
                    results.add (root);
                }
            }else {
                for(TreeNode left : leftNode){
                    for(TreeNode right : rightNode){
                        TreeNode root = new TreeNode ( i );
                        root.left = left;
                        root.right = right;
                        results.add ( root );
                    }
                }
            }


        }
        return results;
    }

    public static void main(String[] args) {
        Solution095 mySolution = new Solution095 ();
        System.out.println ( mySolution.generateTrees ( 3 ) );
    }

}


public class UniqueBinarySearchTrees2 {
}
