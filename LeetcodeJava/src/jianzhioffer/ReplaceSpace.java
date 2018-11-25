package jianzhioffer;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 11:20 2018/11/25
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        while(str.indexOf ( " " ) != -1) {
            int i = str.indexOf ( " " );
            str.replace ( i, i+1, "%20" );
        }
        return str.toString ();
    }

}
