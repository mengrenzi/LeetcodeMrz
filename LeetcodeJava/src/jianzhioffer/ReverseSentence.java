package jianzhioffer;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 12:08 2019/1/5
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class ReverseSentence {
    public String ReverseSentence(String str) {
        if(str.trim ().equals ( "" )) {
            return str;
        }
        String[] strs = str.split ( " " );
        int len = strs.length - 1;
        StringBuilder sb = new StringBuilder (  );
        for(int i = 0; i< strs.length; i++) {
            sb.append ( strs[len - i] );
        }
        return sb.toString ();
    }
}
