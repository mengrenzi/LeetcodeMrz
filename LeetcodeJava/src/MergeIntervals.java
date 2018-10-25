import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.sort;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 21:02 2018/10/18
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 *
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 *
 * Sample1:
 *     Input: [[1,3],[2,6],[8,10],[15,18]]
 *     Output: [[1,6],[8,10],[15,18]]
 *
 */

class Solution056 {
    public List<Interval> merge(List<Interval> intervals) {
        ArrayList<Interval> results = new ArrayList <> (  );
        if(intervals.size () == 0) return results;
        ArrayList<Integer> start = new ArrayList <> (  );
        ArrayList<Integer> end = new ArrayList <> (  );

        for(Interval temp : intervals){
            start.add ( temp.start );
            end.add ( temp.end );
        }

        Collections.sort(start);
        Collections.sort(end);

        int i = 1, startInt = start.get ( 0 ), endInt =  end.get (0), nextstartInt;

        while(i < intervals.size ()) {
            nextstartInt = start.get (i);
            endInt = end.get (i - 1);
            if(nextstartInt > endInt) {
                results.add ( new Interval ( startInt, endInt ) );
                startInt = start.get (i);
            }
            i++;
        }
        results.add( new Interval ( startInt, end.get(intervals.size () - 1) ) );
        return results;
    }

    public static void main(String[] args) {
        Solution056 mysolution = new Solution056 ();
        ArrayList<Interval> test = new ArrayList <> (  );
        test.add ( new Interval ( 1,3  ) );
        test.add ( new Interval ( 2,6  ) );
        test.add ( new Interval ( 8,10  ) );
        test.add ( new Interval ( 15,18  ) );
        List<Interval> x;
        x = mysolution.merge ( test );
        for(Interval temp : x){
            System.out.println ( temp.start + " " + temp.end );

        }
    }
}

public class MergeIntervals {
}
