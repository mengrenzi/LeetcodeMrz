/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 21:29 2018/9/26
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution461 {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}

public class HammingDistance {
}
