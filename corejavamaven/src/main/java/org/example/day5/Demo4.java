package org.example.day5;

import java.util.*;

public class Demo4 {
    public static void main(String[] args) {
        Deque<Integer> q1=new ArrayDeque<>();
        q1.add(10);
        q1.add(20);
        System.out.println(q1);
        q1.push(30); // push to top
        System.out.println(q1);
        System.out.println(q1.pop());// remove from top of the stack
        System.out.println(q1);
        System.out.println(q1.remove());// removes from top(if queue/deque)
        System.out.println(q1);
    }
}
