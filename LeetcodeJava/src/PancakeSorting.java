import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 10:40 2019/1/6
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class PancakeSorting {
}

class Solution971 {
    public static List<Integer> pancakeSort(int[] A) {
        ArrayList<Integer> list = new ArrayList<>();
        if(A.length == 0) return list;
        for(int i = A.length; i> 0; i--) {
            help ( A, list, i );
        }
        return list;
    }

    public static void help(int[] A, ArrayList<Integer> list, int len) {
        if(A[len - 1] != len) {
            int j;
            for(j = 0; j< len; j++) {
                if(A[j] == len) break;
            }
            list.add ( j + 1 );
            flip ( A, j);
            list.add ( len);
            flip ( A, len - 1);
        }
    }

    private static void flip(int[] A, int index) {
        int i = 0, j = index;
        while (i < j) {
            int temp = A[i];
            A[i++] = A[j];
            A[j--] = temp;
        }
    }

    public static List<Integer> pancakeSort2(int[] A) {
        List<Integer> ans = new ArrayList<>();
        int N = A.length;

        Integer[] B = new Integer[N];
        for (int i = 0; i < N; ++i)
            B[i] = i+1;
        Arrays.sort(B, (i, j) -> A[j-1] - A[i-1]);

        for (int i: B) {
            for (int f: ans)
                if (i <= f)
                    i = f+1 - i;
            ans.add(i);
            ans.add(N--);
        }

        return ans;
    }

    public static void main(String[] args) {
        pancakeSort ( new int[]{3,2,4,1} );
        pancakeSort2 ( new int[]{3,2,4,1} );
    }
}
