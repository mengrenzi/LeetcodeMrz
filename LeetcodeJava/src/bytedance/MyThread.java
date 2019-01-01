package bytedance;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 12:29 2018/12/27
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class MyThread extends Thread{


    private static Object lock = new Object();

    private static int i = 1;

    public static void main(String[] args) {
        Thread thread1 = new Thread() {
            public void run() {
                while (i <= 10) {
                    synchronized (lock) {
                        if (i % 2 == 1) {
                            System.out.println("thread1  " + i++);
                        } else {
                            lock.notifyAll();
                            try {
                                lock.wait(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                }
            }
        };

        Thread thread2 = new Thread() {
            public void run() {
                while (i <= 10) {
                    synchronized (lock) {
                        if (i % 2 == 0) {
                            System.out.println("thread2  " + i++);
                        } else {
                            lock.notifyAll();
                            try {
                                lock.wait(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                }
            }
        };
        thread1.start();
        thread2.start();
    }
}
