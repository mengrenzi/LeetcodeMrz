import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 9:21 2018/9/21
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution022 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList <String> (  );
        helper ("",result, n, 0, 0);
        return result;
    }

    public void helper(String curr, List<String> result, int n, int left, int right){
        if(right == n){
            result.add ( curr );
            return ;
        }

        if(left < n){
            helper ( curr + '(', result, n, left + 1, right );

        }

        if(left > right) {
            helper ( curr + ')', result, n, left, right + 1 );
        }
    }
}

public class GenerateParentheses {
}
