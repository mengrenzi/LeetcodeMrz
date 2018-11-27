package jianzhioffer;

import java.util.ArrayList;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 16:03 2018/11/25
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class Fibonacci {

    public int Fibonacci(int n) {
        ArrayList <Integer> fbList = new ArrayList<> (  );
        fbList.add( 0 );
        fbList.add ( 1 );
        for(int i = 2; i<= 39; i++) {
            fbList.add ( fbList.get ( i - 1 ) + fbList.get ( i - 2 ));
        }

        return fbList.get ( n );
    }

}
