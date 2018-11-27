package bytedance;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 13:14 2018/11/26
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt ();
        }

        Arrays.sort(nums);

        for(int i : nums){
            System.out.print ( i + " " );
        }

    }
}
