package jianzhioffer;
import java.util.Stack;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 11:15 2018/12/20
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */


public class MyStack {

    Stack<Integer> stack1,stack2;

    public void push(int node) {
        stack1.push ( node );
        if(stack2.empty ()) {
            stack2.push ( node );
        }else if(stack2.peek () > node){
            stack2.push ( node );
        }
    }

    public void pop() {
        if(stack1.peek ()==stack2.peek ())
            stack2.pop();
        stack1.pop();
    }

    public int top() {
        return stack1.peek ();
    }

    public int min() {
        return stack2.peek ();
    }
}