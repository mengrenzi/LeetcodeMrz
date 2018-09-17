/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 11:37 2018/9/16
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution011 {
    public int maxArea(int[] height) {
        int Length = height.length;
        int first = 0, last = Length - 1, max = (last - first) * Math.min ( height[first],height[last] );
        while(first != last){
            if (height[first] < height[last]) {
                first++;
            } else {
                last--;
            }

            max = Math.max (max ,(last - first) * Math.min ( height[first],height[last] ));
        }
        return max;
    }
}

public class ContainerWMW {
    public static void main(String[] args) {
        Solution011 mysolution = new Solution011 ();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println ( mysolution.maxArea ( height) );
    }
}
