import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 10:51 2019/1/6
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class FlipMatchVoyage {
}

class Solution972 {
    public static List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        LinkedList<Integer> list = new LinkedList <> (  );
        if(!help ( root, voyage, 0, list )) {
            list.add ( -1 );
            return list;
        }else {
            return list;
        }
    }

    private static boolean help(TreeNode root, int[] voyage, int i, List<Integer> path){
        if(root == null && voyage.length == 0) return true;
        if(root == null || voyage.length == 0) return false;
/*
        Boolean left = help ( root, voyage, i + 1, path );
        Boolean right = help (  );

        Boolean right;
*/
        return false;
    }


    private static void PreorderTraversal(TreeNode root, List<Integer> list){
        if(root == null) {return;}
        list.add ( root.val );
        PreorderTraversal ( root.left, list );
        PreorderTraversal ( root.right, list );
    }


    public static void main(String[] args) throws UnknownHostException {

    }

}