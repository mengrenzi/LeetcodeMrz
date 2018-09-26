import java.util.HashSet;
import java.util.Set;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 21:06 2018/9/26
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] s = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> resChar = new HashSet <> (  );
        int result;

        for(int i = 0; i< words.length; i++){
            String JChar = "";
            for(int j = 0; j< words[i].length (); j++){
                int num = (int) words[i].charAt ( j ) - 'a';
                JChar = JChar + s[num];
            }
            resChar.add ( JChar );
        }

        return resChar.size ();
    }

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        Solution804 mysolution = new Solution804 ();
        System.out.println (mysolution.uniqueMorseRepresentations ( words ));
    }
}

public class UniqueMorseCodeWords {

}
