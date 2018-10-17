/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 21:42 2018/10/17
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution069 {
    public int mySqrt(int x) {
        long result = 0;
        if(x == 0) return (int)result;
        for(result = 1; result * result <= x; result++);
        return (int)result - 1;
    }
}

public class Sqrt {

}
