package Renzi2019;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 15:59 2019/1/17
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class letterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String> result = new LinkedList <> (  );
        if(digits == null || digits.length () == 0) return result;
        Map<Character, String> map = new HashMap<> ();
        initMap(map);
        for(int i = 0; i< map.get ( digits.charAt(0) ).length (); i++) {
            String s = String.valueOf ( map.get ( digits.charAt ( 0 ) ).charAt ( i ) );
            dfs(result, s, digits.substring ( 1 ), map);
        }
        return result;
    }

    private void initMap(Map<Character, String> map) {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }

    private void dfs(List<String> list, String s, String digits, Map<Character, String> map) {
        if(digits == null || digits.length () == 0) {
            list.add ( s );
            return;
        }
        for(int i = 0; i< map.get ( digits.charAt(0) ).length (); i++) {
            dfs ( list, s + String.valueOf ( map.get ( digits.charAt ( 0 ) ).charAt ( i ) ), digits.substring ( 1 ) , map);
        }

    }


}
