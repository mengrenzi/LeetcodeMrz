/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 11:30 2018/11/2
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */
class Solution0079 {
    public boolean exist(char[][] board, String word) {
        if(board == null) return false;
        char[] w = word.toCharArray ();
        boolean[][] used = new boolean[board.length][board[0].length];
        for(int i = 0; i< board.length; i++) {
            for(int j = 0; j< board[0].length; j++) {
                if(help ( board, used, w, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean help(char[][] board,boolean[][] used, char[] w, int idx, int row, int col) {
        if( idx == w.length) return true;
        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length) return false;
        if(used[row][col] || board[row][col] != w[idx]) return false;
        used[row][col] = true;

        if(help ( board, used, w, idx + 1, row + 1, col )
            || help ( board, used, w, idx + 1, row, col + 1 )
            || help ( board, used, w, idx + 1, row - 1, col )
            || help ( board, used, w, idx + 1, row, col - 1))
            return true;

        used[row][col] = false;
        return false;
    }
}


public class WordSearch {
}
