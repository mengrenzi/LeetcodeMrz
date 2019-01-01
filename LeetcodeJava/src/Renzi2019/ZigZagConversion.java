package Renzi2019;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 13:44 2018/12/27
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class ZigZagConversion {
    public static String convert(String s, int numRows) {
        if(s == null || numRows == 0 ||s.length () <= numRows) return s;
        String result = "";

        StringBuilder resBuilder = new StringBuilder ( result );
        for(int j = 0; j < numRows; j++) {
            int x = (numRows - 1 - j) * 2;
            int y = j * 2;
            int num = j;

            resBuilder.append ( s.charAt ( j ) );

            while(s.length () > num) {
                if(x != 0) {
                    num += x;
                    if(s.length () <= num) break;
                    resBuilder.append ( s.charAt(num) );
                }
                if(y != 0) {
                    num += y;
                    if(s.length () <= num) break;
                    resBuilder.append ( s.charAt(num) );
                }
            }

        }
        return resBuilder.toString ();
    }

    public static void main(String[] args) {
        convert ( "PAYPALISHIRING", 3 );
    }
}
