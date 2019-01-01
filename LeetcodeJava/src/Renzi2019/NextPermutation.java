package Renzi2019;

import java.util.Arrays;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 14:23 2019/1/1
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class NextPermutation {
}



class Solution31 {
    public String frequencySort(String s) {
        int len = s.length ();
        if(len == 0) return s;
        int[] x = new int[128];
        int i = len - 2;

        while(i > 0 && x[i] > x[i-1]) {
            i--;
        }

        char[] sArray = s.toCharArray ();

        if(i != 0) {
            for(int j = i + 1; j < s.length (); j++) {
                if(sArray[j] < )
            }
        }

        for(int j = i; j < s.length (); j++) {

        }


        return Arrays.toString ( sArray );
    }

    private String swap(int i, int j, String s) {
        char[] sArray = s.toCharArray ();
        char tmp = sArray[i];
        sArray[i] = sArray[j];
        sArray[j] = tmp;
        return Arrays.toString ( sArray );
    }

    private void swap(int i, int j, char[] sArray) {
        char tmp = sArray[i];
        sArray[i] = sArray[j];
        sArray[j] = tmp;
    }

}