package jianzhioffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 10:28 2018/12/22
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class PrintMinNumber {
    public String PrintMinNumber(int [] numbers) {
        StringBuilder res = new StringBuilder ();
        if(numbers == null || numbers.length == 0) return res.toString ();
        ArrayList<String> list = new ArrayList <> (  );
        for(int i = 0; i< numbers.length; i++) {
            list.add ( String.valueOf ( numbers[i] ) );
        }

        Collections.sort( list, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s1.compareTo ( s2 );
            }
        });

        for (String s:
             list ) {
            res.append ( s );
        }
        
        return res.toString ();
        
    }

    public static void main(String[] args) {
        String x1 = "123";
        String x2 = "345";
        String x3 = x1 + x2;
        System.out.println ( x3 );
    }
}
