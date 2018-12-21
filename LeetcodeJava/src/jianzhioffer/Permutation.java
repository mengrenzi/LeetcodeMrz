package jianzhioffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 14:21 2018/12/21
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class Permutation {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if(str == null || str.length() == 0) return res;
        PermutationHelper(str.toCharArray(), new int[str.length ()], res, new StringBuilder (  ));
        Collections.sort(res);
        return res;
    }

    private void PermutationHelper(char[] cs, int[] used, List <String> list, StringBuilder sb) {
        if(cs.length == sb.length ()) {
            if(!list.contains ( sb.toString () )) list.add ( sb.toString () );
            return;
        }

        for(int i = 0; i< cs.length; i++) {
            if(used[i] == 1) continue;
            used[i] = 1;
            char x = cs[i];
            sb.append ( x );
            PermutationHelper ( cs, used, list, sb );
            used[i] = 0;
            sb.deleteCharAt ( sb.length () - 1 );
        }
    }

    private void swap(char[] cs, int i, int j) {
    }

    public static void main(String[] args) {
        Permutation p = new Permutation ();
        ArrayList<String> x = p.Permutation ( "ab" );
        for (String s: x) {
            System.out.println ( s );
        }
    }

}
