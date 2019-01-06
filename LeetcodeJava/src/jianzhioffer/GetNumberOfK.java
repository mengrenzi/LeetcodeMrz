package jianzhioffer;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 22:42 2019/1/4
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class GetNumberOfK {
    public static int GetNumberOfK(int [] array , int k) {
        if(array == null || array.length <= 0) return 0;
        int left = GetFirstK ( array, array.length, k, 0, array.length - 1 );
        int right = GetLastK(array, array.length, k, 0, array.length - 1);
        if(left == -1) return 0;
        return right - left + 1;
    }

    public static int GetFirstK(int[] array, int length, int k, int start, int end) {
        if(start > end) return -1;

        int mid = (start + end) / 2;

        if (array[mid] == k) {
            if(mid > 0 && array[mid - 1] == k) {
                end = mid - 1;
            }else {
                return mid;
            }
        }else if(array[mid] > k) {
            end = mid - 1;
        }else {
            start = mid + 1;
        }
        return GetFirstK ( array, length, k, start, end );
    }

    public static int GetLastK(int[] array, int length, int k, int start, int end) {
        if(start > end) return -1;

        int mid = (start + end) / 2;

        if (array[mid] == k) {
            if(mid < array.length - 1 && array[mid + 1] == k) {
                start = mid + 1;
            }else {
                return mid;
            }
        }else if(array[mid] > k) {
            end = mid - 1;
        }else {
            start = mid + 1;
        }
        return GetLastK ( array, length, k, start, end );
    }

    public static void main(String[] args) {
        GetNumberOfK ( new int[]{1,2,3,3,3,3,4,5}, 3);
    }
}
