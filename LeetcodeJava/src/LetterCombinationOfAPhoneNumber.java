import java.util.*;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 10:13 2018/9/18
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */


class Solution017 {

    private void dfs(String curr, int currIndx, String digits, List<String> result, String[] map){
        if(currIndx == digits.length ()){
            result.add(curr);
        }else {
            int c = Integer.valueOf (digits.charAt ( currIndx ) + "");
            char[] mapArray = map[c].toCharArray ();
            for(char ch : mapArray){
                dfs ( curr + ch, currIndx + 1, digits, result, map);
            }
        }
    }

    public List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList <String> (  );
        if(digits == null || digits.length () == 0){
            return result;
        }
        String[] map = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        dfs ( "", 0, digits, result, map );

        return result;
    }
}

public class LetterCombinationOfAPhoneNumber {
    public static void main(String[] args){
        Solution017 mysolution = new Solution017 ();
        System.out.println(mysolution.letterCombinations ( "23" ));
    }
}
