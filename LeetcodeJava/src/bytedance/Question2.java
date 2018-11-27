package bytedance;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 13:25 2018/11/26
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class Question2 {
    public static Float calculate(String s) {
        Stack<Float> stack = new Stack<>();
        Stack<Float> stack2 = new Stack <> ();
        Stack<Float> stack3 = new Stack <> ();
        float result = 0;
        int number = 0;
        int sign = 1;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt ( i );
            if(c == '^') {
                for(int j = i; j>= 0; j--) {
                    if(!Character.isDigit ( c )) {

                    }
                }
            }
        }

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                number = 10 * number + (int)(c - '0');
            }else if(c == '+'){
                stack2.push ( (float) (sign * number) );
                number = 0;
                sign = 1;
            }else if(c == '-'){
                stack2.push ( (float) (sign * number) );
                number = 0;
                sign = -1;
            }else if(c == '('){
                stack.push(result);
                stack.push( (float) sign );
                sign = 1;
                result = 0;
            }else if(c == ')'){
                stack2.push ( (float) (sign * number) );
                number = 0;
                stack2.push ( stack.pop() * result );
                stack2.push ( stack.pop() + result );
            }else if(c == '*'){
                stack2.push ( stack2.pop (  ) * number );
            }else if(c == '/'){
                if(number == 0) return Float.NaN;
                stack2.push ( stack2.pop (  ) / number );
            }else if(c == '^'){
                stack2.push ( (float) Math.pow ( stack2.pop () , number ) );
            }
        }
        if(number != 0) {
            stack2.push ( (float) (sign * number) );
        }

        float re = 0;
        for(float x:stack2){
            re += x;
        }
        return re;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next ();
        System.out.println ( calculate(s) );
    }


}
