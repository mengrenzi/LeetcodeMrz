import java.util.Map;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 17:26 2018/10/25
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution072 {
    public int minDistance(String word1, String word2) {
        int solutions[][] = new int[word1.length () + 1][word2.length () + 1];
        for(int i = 0; i< word1.length () + 1; i++) {
            solutions[i][0] = i;
        }

        for(int i = 0; i< word2.length () + 1; i++) {
            solutions[0][i] = i;
        }

        int temp;
        for(int i = 1; i< word1.length () + 1; i++) {
            for(int j = 1; j< word2.length () + 1; j++) {
                temp = Math.min ( solutions[i - 1][j] + 1,  solutions[i][j - 1] + 1);
                if(word1.charAt ( i - 1) == word2.charAt ( j - 1)) {
                    solutions[i][j] = Math.min ( temp, solutions[i-1][j-1] );
                }else {
                    solutions[i][j] = Math.min ( temp, solutions[i-1][j-1]+1 );
                }
            }
        }

        return solutions[word1.length ()][word2.length ()];
    }

    public static void main(String[] args) {
        Solution072 mysolution = new Solution072();
        System.out.println ( mysolution.minDistance ( "horse","ros") );
    }
}

public class EditDistance {

}
