package Renzi2019;

import java.util.Stack;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 15:10 2018/12/27
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack <> ();
        for (int i = 0; i< s.length (); i++) {
            char c = s.charAt ( i );
            if(c == '{' || c == '[' || c == '(') {
                stack.add ( c );
            }else {
                char cstack;
                if(!stack.isEmpty ()) cstack = stack.pop ();
                else return false;
                if(cstack == '{') {
                    if(c == '}'){
                        continue;
                    }
                }
                if(cstack == '[') {
                    if(c == ']'){
                        continue;
                    }
                }
                if(cstack == '(') {
                    if(c == ')'){
                        continue;
                    }
                }
                return false;
            }
        }

        return true;
    }
}
