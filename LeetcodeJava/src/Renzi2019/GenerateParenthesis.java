package Renzi2019;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 16:35 2019/1/17
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        LinkedList<String> result = new LinkedList <> (  );
        if(n <= 0) {return result;}
        help ( result,"(", 1, 0, n);
        return result;
    }

    private void help(List<String> list, String s, int left, int right, int n) {
        if(left < right) return;
        if(left < n)  help ( list, s + '(', left + 1, right, n );
        if(right < n) help ( list, s + ')', left,right + 1, n );
        if(left == right && left == n) list.add ( s );
    }
}
