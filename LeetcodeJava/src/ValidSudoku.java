import java.util.Arrays;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 0:09 2018/9/27
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution036 {
    public boolean isValidSudoku(char[][] board) {
        if(board == null || board.length != 9 || board[0].length != 9) return false;

        boolean[] flag = new boolean[9];
        for(int col = 0; col< 9; col++){
            Arrays.fill ( flag, false );
            for(int row = 0; row< 9; row++) {
                char c = board[row][col];
                if(c != '.'){
                    int num = c - '1';
                    if(flag[num] == false) flag[num] = true;
                    else return false;
                }
            }
        }

        for(int row = 0; row< 9; row++){
            Arrays.fill ( flag, false );
            for(int col = 0; col< 9; col++) {
                char c = board[row][col];
                if(c != '.'){
                    int num = c - '1';
                    if(flag[num] == false) flag[num] = true;
                    else return false;
                }
            }
        }

        for(int box = 0; box <9; box++){
            Arrays.fill ( flag, false );
            for(int row = 0; row < 3; row++){
                for(int col = 0; col< 3; col ++){
                    char c = board[row + 3 * (box/3)][col + 3 * (box%3)];
                    if(c != '.'){
                        int num = c - '1';
                        if(flag[num] == false) flag[num] = true;
                        else return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        Solution036 mysolution = new Solution036 ();
        System.out.println ( mysolution.isValidSudoku(board) );
    }
}

public class ValidSudoku {
}
