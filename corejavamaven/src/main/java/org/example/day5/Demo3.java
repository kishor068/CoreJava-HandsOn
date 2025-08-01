package org.example.day5;

import java.util.*;

public class Demo3 {
    public static void main(String[] args) {
        Queue<Integer> q1=new LinkedList<>();
        q1.add(10);
        q1.add(20);
        q1.add(50);
        q1.add(32);
        System.out.println(q1);
        System.out.println(q1.remove()); //works in form of FIFO
        System.out.println(q1);
        System.out.println(q1.remove());


    }
}
