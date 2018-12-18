package jianzhioffer;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 7:43 2018/12/16
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class NumberOf1 {

    public int NumberOf1(int n) {
        int count = 0;
        int flag = 1;

        while(flag != 0) {
            if((n & flag) != 0) {
                count++;
            }
            flag = flag << 1;
        }

        return 0;
    }


    public static void main(String[] args) {
        NumberOf1 num = new NumberOf1 ();

        num.NumberOf1 ( -2147483648 );

        System.out.println ( 2 & 2 );
    }

}
