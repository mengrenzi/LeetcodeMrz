import java.util.HashMap;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 12:28 2018/9/16
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution013 {
    public int romanToInt(String s) {
        int result = 0;

        HashMap<Character, Integer> mapAdd = new HashMap<Character, Integer> (  );
        mapAdd.put('I', 1);
        mapAdd.put('V', 5);
        mapAdd.put('X', 10);
        mapAdd.put('L', 50);
        mapAdd.put('C', 100);
        mapAdd.put('D', 500);
        mapAdd.put('M', 1000);

        for(int i = 0; i< s.length (); i++){
            if(i <(s.length()-1) && mapAdd.get (s.charAt ( i )) < mapAdd.get (s.charAt ( i+1 )))
                    result -= mapAdd.get (s.charAt ( i ));
            else
                result += mapAdd.get (s.charAt ( i ));
        }
        return result;
    }
}

public class RtoI {
    public static void main(String[] args){
        Solution013 mysolution = new Solution013 ();
        System.out.println(mysolution.romanToInt("MCMXCIV" ));
    }
}
