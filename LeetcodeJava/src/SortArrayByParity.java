/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 20:49 2018/9/26
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution905 {
    public int[] sortArrayByParity(int[] A) {
        int head = 0, bot = A.length - 1;
        int[] result = new int[A.length];
        for(int i = 0; i< A.length - 1; i++){
            if(A[i] % 2 == 0){
                result[head++] = A[i];
            }else{
                result[bot--] = A[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = {3,1,2,4};
        Solution905 mysolution = new Solution905 ();
        System.out.println ( mysolution.sortArrayByParity(A) );
    }
}

public class SortArrayByParity {
}
