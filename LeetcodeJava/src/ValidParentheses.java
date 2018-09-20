import java.util.HashMap;
import java.util.Stack;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 16:21 2018/9/20
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */


class Solution020 {
    public boolean isValid(String s) {
        if(s.length () == 0)
            return true;
        Stack<Character> stack = new Stack<Character>();
        for( char c : s.toCharArray ()) {
            if(c == '('){
                stack.push ( ')' );
            }else if(c == '{')
            {
                stack.push ( '}' );
            }else if(c == '['){
                stack.push ( ']' );
            }else{
                if(stack.empty () || stack.pop() != c)
                    return false;
            }
        }
        return stack.empty ();
    }
}

public class ValidParentheses {
    public static void main(String[] args){
        Solution020 mysolution = new Solution020 ();
        System.out.println (mysolution.isValid ( "[{}]" ));
    }
}
