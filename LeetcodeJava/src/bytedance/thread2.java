package bytedance;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 12:36 2018/12/27
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class thread2 extends Thread{
    int[] x = new int[]{2,4,6,8};

    @Override
    public void run() {
        for(int a : x){
            System.out.println ( a );
        }
    }

}
