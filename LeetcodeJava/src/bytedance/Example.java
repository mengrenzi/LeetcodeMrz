package bytedance;

import java.util.Scanner;


/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 13:13 2018/11/26
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class Example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }
    }

    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0, x;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                x = sc.nextInt();
                ans += x;
            }
        }
        System.out.println(ans);
    }

}
