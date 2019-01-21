package Stack;

/**
 * @Author: Renzi Meng
 * @Date: 1/19/2019 11:41 AM
 * @Description:
 * @Copyright (C), 2019, Renzi Meng, All Rights Reserved.
 */


public class MyStack {
    private int n = 0;
    private Node first = null;

    public boolean isEmpty(){
        return first == null;
    }

    public void push(int age, String name)
    {
        Node oldfirst = first;
        first = new Node();
        first.age = age;
        first.name = name;
        first.next = oldfirst;
    }

    public Node pop() {
        Node nod = new Node();
        nod.setName(first.name);
        nod.setAge(first.age);
        first = first.next;
        return nod;
    }


    class Node{
        private int age;
        private String name;
        private Node next;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "(" + age + ", " + name + ")";
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        MyStack s = new MyStack();
        s.push(31, "Name1");
        s.push(24, "Name2");
        s.push(10, "Name3");
        s.push(44, "Name4");
        s.push(81, "Name5");

        for(int i = 0; i<5; i++){
            System.out.println(s.pop());
        }
    }

}
