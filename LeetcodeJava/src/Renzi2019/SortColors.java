package Renzi2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 13:04 2018/12/25
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class SortColors {
    public void sortColors(int[] nums) {
        int zero = 0, one = 0, two = 0;
        for(int i = 0; i<= two; i++) {
            if(nums[i] == 1) {
                nums[++zero] = 0;
                nums[++one] = 1;
            }
            if(nums[i] == 1) {
                nums[++one] = 1;
            }
            nums[++two] = 2;
        }
    }
}
