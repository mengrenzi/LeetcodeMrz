package jianzhioffer;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 23:21 2018/12/15
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class ReOrderArray {

    private void swap(int x, int y, int[] array) {
        int tmp = array[x];
        array[x] = array[y];
        array[y] =tmp;
    }

    private void help(int start, int step, int[] array) {
        if (step == 0) return;
        int end = start + step;
        int tmp = array[end];
        for (int i = end; i> start; i--) {            int iTmp = array[i];
            array[i] = array[i-1];
        }
        array[start] = tmp;
    }


    public void reOrderArray(int [] array) {
        int len = array.length;
        int step = 0;
        for(int i = 0; i < len; i++) {
            if(array[i] % 2 == 1){
                help ( i - step, step, array );
            }else {
                step++;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i = 0;i< 10; i++) {
            array[i] = i;
        }
        ReOrderArray reorder = new ReOrderArray ();
        reorder.reOrderArray ( array );

        for(int i = 0;i< 10; i++) {
            System.out.println ( array[i] );
        }

    }

}
