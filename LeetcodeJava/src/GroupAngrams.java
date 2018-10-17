import java.util.*;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 18:14 2018/10/17
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

class Solution049{
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList <> (  );
        HashMap<String, List<String>> map = new HashMap <String, List<String>> (  );
        for(int i = 0; i < strs.length; i++){
            char[] arrs = strs[i].toCharArray ();
            Arrays.sort(arrs);
            String key = String.valueOf(arrs);

            if(!map.containsKey ( key )){
                map.put ( key, new ArrayList <String> (  ) );
            }
            map.get ( key ).add ( strs[i] );
        }
        return new ArrayList <> ( map.values () );
    }

    public static void main(String[] args) {

    }
}

public class GroupAngrams {
}
