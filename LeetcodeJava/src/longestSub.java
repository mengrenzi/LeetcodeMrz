import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 14:46 2018/9/13
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution003 {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        if(s.length () == 0) return 0;
        Map <String, Integer> map = new HashMap <String, Integer> (  );
        String[] strings = s.split("");
        for(int i = 0, j = 0; i< strings.length; i++){
            if(map.containsKey ( strings[i] )){
                j = Math.max(j,map.get(strings[i]) + 1);
            }
            map.put(strings[i], i);
            ans = Math.max ( ans, i - j + 1);
        }

        return ans;
    }
}

public class longestSub {

}
