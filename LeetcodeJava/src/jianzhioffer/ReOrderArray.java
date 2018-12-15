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

    public void reOrderArray(int [] array) {
        int len = array.length;
        for(int i = 0; i < len; i++) {
            if(array[i] % 2 == 0) {

            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        for(int i = 0;i< 5; i++) {
            array[i] = i;
        }
        ReOrderArray reorder = new ReOrderArray ();
        reorder.reOrderArray ( array );

        for(int i = 0;i< 5; i++) {
            System.out.println ( array[i] );
        }

    }

}
