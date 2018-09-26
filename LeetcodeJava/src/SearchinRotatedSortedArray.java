/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 9:17 2018/9/26
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution033 {

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;

        int length = nums.length - 1;
        int leftInd = 0;
        int rightInd = length;
        while (leftInd + 1 < rightInd) {
            int midInd = (leftInd + rightInd) / 2;
            int left = nums[leftInd];
            int right = nums[rightInd];
            int mid = nums[midInd];

            if (target == mid) {
                return midInd;
            }
            if (target == right){
                return rightInd;
            }
            if (target == left){
                return leftInd;
            }

            if(mid > left){
                if(target < mid && target > left){
                    rightInd = midInd - 1;
                }else{
                    leftInd = midInd + 1;
                }

            }else{
                if(target > mid && target < right){
                    leftInd = midInd + 1;
                }else{
                    rightInd = midInd - 1;
                }
            }
        }


        if (nums[rightInd] == target) {
            return rightInd;
        }
        if (nums[leftInd] == target) {
            return leftInd;
        }
        return -1;
    }
         /*

            if(mid > left){
                if(target < mid && target > left){
                    rightInd = midInd - 1;
                }else{
                    leftInd = midInd + 1;
                }

            }else{
                if(target > mid && target < right){
                    leftInd = midInd - 1;
                }else{
                    rightInd = midInd + 1;
                }
            }
            */

            /*
            if(right > left){
                if(mid < target){
                    leftInd = midInd;
                }else{
                    rightInd = midInd;
                }
            }else{
                if(left < mid){
                    leftInd = midInd;
                }
                else{
                    rightInd = midInd;
                }
            }

            if(target > left && target < mid){
                rightInd = midInd;
                midInd = (rightInd + leftInd + 1)/2;
            }else if(target > mid && target < right){
                leftInd = midInd;
                midInd = (rightInd + leftInd + 1)/2;
            }else if(target < mid){

            }
            */

    public static void main(String[] args) {
        Solution033 mysolution = new Solution033 ();
        int[] test = {3,1};
        mysolution.search ( test, 0 );
    }
}

public class SearchinRotatedSortedArray {
}
