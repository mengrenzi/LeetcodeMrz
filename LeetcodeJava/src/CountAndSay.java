/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 10:29 2018/9/27
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution {
    public String countAndSay(int n) {
        String s = "1";
        while(n >=0){
            char value = '.';
            int count = 0;
            StringBuilder sb = new StringBuilder ( );
            for(int i = 0; i< s.length (); i++){
                if(s.charAt ( i ) == value || value == '.'){
                    count++;
                }else{
                    sb.append ( count );
                    sb.append ( value );
                    count = 1;
                }
                value = s.charAt ( i );
            }
            sb.append ( count );
            sb.append ( value );
            n--;
            s = sb.toString ();
        }
        return s;
    }
}

public class CountAndSay {
}
