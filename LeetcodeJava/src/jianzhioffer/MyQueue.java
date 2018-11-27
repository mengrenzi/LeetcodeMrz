package jianzhioffer;

import java.util.Stack;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 15:32 2018/11/25
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class MyQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        while(!stack1.isEmpty ()) {
            stack2.add ( stack1.pop () );
        }
        stack1.add ( node );
        while(!stack2.isEmpty ()) {
            stack1.add ( stack2.pop () );
        }
    }

    public int pop() {
        return stack1.pop ();
    }

}
