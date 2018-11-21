import java.util.*;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 11:16 2018/11/4
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class JavaSkillsForInterview {

    public static void main(String[] args) {
        String s = "abc";

        int index = 0;
        s.charAt ( index );

        int beginIndex = 0, endIndex = 1;
        s.substring ( beginIndex, endIndex );
        s.substring ( beginIndex );

        s.equals ( "b" );
        // 去掉两端多余的空格
        s = s.trim ();
        s.indexOf ( "a" );
        int fromIndex = 1;
        s.indexOf ( "a", fromIndex );
        s.toCharArray ();
        Integer.valueOf (s);    // returns an Integer object
        Integer.parseInt ( s ); // returns an int primitive
        String.valueOf ( s ); // integer to  string

        StringBuilder sb = new StringBuilder (  );
        sb.append ( "a" );
        sb.insert ( 0, "a" );
        sb.deleteCharAt ( sb.length () - 1 );
        sb.reverse ();
        sb.toString ();

        // Array
        int[] a = new int[10];
        char[] b = { 'a', 'b'};
        int[][] c = new int[10][10];

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        Arrays.sort ( a );

        List<Integer> list = new ArrayList <Integer> (  );
        ArrayList<Integer> list1 = new ArrayList <Integer> (  );
        List<List<Integer>> list2 = new ArrayList <List<Integer>> (  );

        list.add ( 0 );
        list.add ( 0, 1 );
        list.get ( 0 );     // index
        list.size ();
        list.remove ( list.size () - 1 );

        int x = 1;
        list.contains ( x );

        Collections.sort(list);
        Collections.sort(list, Collections.<Integer>reverseOrder ());
        Collections.sort ( list, new Comparator <Integer> () {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2; // 0 -> 1
                // o2 -> o1; 1 -> 0
            }
        } );


        // Stack
        Stack<Integer> stack = new Stack <Integer> ();
        stack.push ( 0 );
        stack.pop ();
        // peek() 返回栈顶元素但不移除
        stack.peek ();
        stack.isEmpty ();
        stack.size ();

        // Queue
        Queue<Integer> q = new LinkedList <Integer> (  );
        q.add ( 0 );
        q.remove ();
        q.peek ();
        q.isEmpty ();
        q.size ();

        // HashMap
        HashMap<Character, Integer> map = new HashMap <Character, Integer> (  );
        map.put ( 'c', 1 );
        map.get ( 'c' );
        map.entrySet ();

        if (map.containsValue ( 1 )) {

        }
        if(map.containsKey ( 'c' )) {

        }

        for(Character d : map.keySet ()) {

        }
        for(Integer i : map.values ()) {

        }

        map.isEmpty ();
        map.size ();

        // HashSet
        HashSet<Integer> set = new HashSet <Integer> (  );
        set.add ( 0 );
        set.remove ( 0 );
        if(set.contains ( 0 )) {

        }
        set.isEmpty ();
        set.size ();

        // mini heap
        PriorityQueue<Integer> pq = new PriorityQueue <Integer> (  );
        pq.add ( 0 );
        pq.remove (  );
        pq.peek ();
        pq.isEmpty ();
        pq.size ();
        while (!pq.isEmpty ()) {

        }
    }
}
