import java.util.Map;
import java.util.Stack;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 10:42 2018/9/25
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */


class solution{
    public int longestValidParentheses(String s){
        int leftmost = -1, idx = 0, max = 0;
        if(s.length () <= 1){
            return max;
        }
        Stack stack = new Stack ();
        for(int i = 0; i< s.length (); i++){
            if(s.charAt ( i ) == '('){
                stack.push ( i );
            }else{
                if(stack.isEmpty ()){
                    leftmost = i;
                }else{
                    stack.pop ();
                    if(stack.isEmpty ()){
                        max = Math.max ( max, i - leftmost );
                    }else{
                        max = Math.max ( max, i - (int) stack.peek () );
                    }
                }
            }

        }
        return max;
    }
}

public class LongestValidParentheses {
}
