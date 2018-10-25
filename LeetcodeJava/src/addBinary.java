import java.util.LinkedList;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 14:59 2018/10/25
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution067 {
    public String addBinary(String a, String b) {
        StringBuffer sb = new StringBuffer (  );

        if(a.length () < b.length ()) {
            String temp = a;
            a = b;
            b = temp;
        }
        LinkedList<Character> results = new LinkedList <Character> (  );
        int carry = 0, x;
        a = '0' + a;
        for(int i = b.length (); i< a.length (); i++){
            b = '0' + b;
        }

        for(int i = a.length () - 1; i>= 0; i--) {
            x = a.charAt ( i ) - '0' + b.charAt ( i ) - '0' + carry;
            if(x / 2 > 0){
                carry = 1;
            }else{
                carry = 0;
            }
            char value = (char) (x % 2 + '0');
            sb.append ( value );
        }

        for(int i = a.length () - 1; i> 0; i--){
            if(sb.charAt ( i ) == '0'){
                sb.deleteCharAt ( i );
            }else {
                break;
            }
        }

        return sb.reverse ().toString ();
    }

    public static void main(String[] args) {
        Solution067 mysolution = new Solution067 ();
        System.out.println ( mysolution.addBinary ( "0", "0" ) );
    }
}

public class addBinary {
}
