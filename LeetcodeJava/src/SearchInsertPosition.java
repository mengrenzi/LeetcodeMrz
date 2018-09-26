/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 20:17 2018/9/26
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution035 {
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0 || nums == null){
            return 0;
        }

        int left = 0, right = nums.length - 1, mid;

        while(left + 1 <right){
            mid = (left + right)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                right = mid;
            }else{
                left = mid;
            }
        }

        if(target <= nums[left]){
            return left;
        }else if(target <= nums[right]){
            return right;
        }else{
            return right + 1;
        }
    }

    public static void main(String[] args) {
        int[] s = {1,3,5,6};
        Solution035 mysolution = new Solution035();
        System.out.println ( mysolution.searchInsert ( s, 7 ) );
    }
}

public class SearchInsertPosition {

}
