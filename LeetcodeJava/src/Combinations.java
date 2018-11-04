import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 18:00 2018/10/25
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution077 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> results = new LinkedList <> (  );
        help ( results, new LinkedList <Integer> (  ),n , k, 1 );
        return results;
    }

    void help(List<List<Integer>> results, List<Integer> x, int n,int k, int idx) {
        if(k == 0) {
            results.add ( new LinkedList <Integer> ( x ) );
        }else {
            for(int i = idx; i<= n; i++) {
                x.add ( i );
                help ( results, x, n, k - 1, i+1 );
                x.remove (x.size () - 1);
            }
        }
    }

    public static void main(String[] args) {
        Solution077 mysolution = new Solution077();
        System.out.println ( mysolution.combine (4,2) );
    }
}

public class Combinations {
}
