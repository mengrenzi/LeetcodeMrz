package bytedance;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 22:34 2018/12/9
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class lis {
    public void lis(float[] L){
        final int n = L.length;
        int[] f = new int[n];
        f[0] = 1;
        for(int i = 1; i< n; i++) {
            f[i] = 1;
            for (int j = 0; j< i; j++) {
                if(L[i] < L[j]) {
                    f[i] = Math.max ( f[i], f[j] + 1 );
                }
            }
        }
    }
}
