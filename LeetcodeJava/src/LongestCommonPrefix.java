/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 10:03 2018/9/17
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution014 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null){
            return "";
        }

        int flag;
        String result = strs[0];

        for(int i = 1; i< strs.length; i++){
            flag = 0;
            while(flag < Math.min ( result.length(), strs[i].length() )
                    && result.charAt ( flag ) == strs[i].charAt ( flag )){
                flag++;
            }
            result = result.substring ( 0, flag );
        }

        return result;
    }
}

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Solution014 mysolution = new Solution014 ();
        System.out.println ( mysolution.longestCommonPrefix ( new String[]{"dog", "car", "racecar"} ) );
    }
}
