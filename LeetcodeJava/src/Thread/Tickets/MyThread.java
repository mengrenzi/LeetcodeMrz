package Thread.Tickets;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 19:08 2019/1/5
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class MyThread implements Runnable {

    private int ticketsCount = 5;

    @Override
    public void run() {
        while(ticketsCount > 0) {
            ticketsCount--;
            System.out.println ( "Remain Tickets:" + ticketsCount );
        }
    }
}

