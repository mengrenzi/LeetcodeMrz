import java.util.ArrayList;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 13:38 2018/10/25
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution060 {
    public String getPermutation(int n, int k) {
        int[] factorial = new int[n];
        char[] results = new char[n];
        ArrayList<Integer> nums = new ArrayList <Integer> (  );
        factorial[0] = 0;
        if(n <= 1){
            return String.valueOf ( n );
        }
        factorial[1] = 1;
        for(int i = 2; i< n; i++){
            factorial[i] = factorial[i - 1] * i;
        }
        for(int i = 1; i<= n; i++){
            nums.add ( i );
        }

        k--;
        for(int i = n - 1; i> 0; i--){
            results[n - 1 - i] = Character.forDigit ( nums.remove ( k/factorial[i] ),10 );
            k = k % factorial[i];
        }
        results[n - 1] = Character.forDigit (  nums.remove ( 0 ),10);

        return new String ( results );
    }

    public static void main(String[] args) {
        Solution060 mysolution = new Solution060 ();
        System.out.println ( mysolution.getPermutation ( 3 , 3 ) );
    }
}

public class PermutationSequence {
}

