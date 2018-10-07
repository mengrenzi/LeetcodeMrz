import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 17:57 2018/10/7
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution131 {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new LinkedList<> (  );
        dfs(result, s, new LinkedList<> (  ), 0);
        return result;
    }

    void dfs(List<List<String>> result,String s, LinkedList tempList, int start){
        if(start >= s.length ()){
            result.add (new ArrayList<String> (tempList));
        }else{
            for(int i = start + 1; i <= s.length (); i++){
                StringBuilder sb = new StringBuilder ( s.substring ( start, i ) );
                if(isPalindrome ( sb )){
                    tempList.add ( sb.toString () );
                    dfs(result, s, tempList, i);
                    tempList.remove ( tempList.size () - 1 );
                }
            }
        }
        return;
    }

    boolean isPalindrome(StringBuilder sb){
        return sb.toString ().equals (sb.reverse ().toString ());
    }

    public static void main(String[] args) {
        Solution131 mysolution = new Solution131 ();
        String s = "aab";
        StringBuilder sb = new StringBuilder ( "ab" );
        System.out.println ( "ab".equals ( "ba" ) );
        System.out.println ( sb == sb.reverse ());
        System.out.println ( mysolution.partition (s) );
    }
}

public class isPalindromePartitioning {

}
