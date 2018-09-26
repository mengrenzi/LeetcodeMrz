import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 21:44 2018/9/26
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution657 {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'R') x++;
            else if (c == 'L') x--;
            else if (c == 'U') y--;
            else if (c == 'D') y++;
        }
        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        Solution657 mysolution = new Solution657 ();
        System.out.println ( mysolution.judgeCircle ( "LL" ) );
    }
}

public class RobotReturntoOrigin {
}
