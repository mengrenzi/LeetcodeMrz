/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 12:47 2018/9/14
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution006 {
    public String convert(String s, int numRows) {
        String ans = "";

        if(numRows == 1){
            return s;
        }

        numRows -= 1;
        for (int j = 0; j < numRows + 1; j++) {
            for(int i = 0; i< s.length (); i++) {
                if (i % (numRows * 2) == j || i % (numRows * 2) == numRows * 2 - j) {
                    ans = ans + s.charAt ( i );
                }
            }
        }

        return ans;
    }
}

public class zigZagConversion {
    public static void main(String[] args){
        Solution006 mysolution = new Solution006 ();
        System.out.println(mysolution.convert ( "A", 1 ));
    }
}
