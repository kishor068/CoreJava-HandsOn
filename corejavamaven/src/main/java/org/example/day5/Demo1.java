package org.example.day5;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        List<String> l1=new ArrayList<>();
        l1.add("Bengaluru");
        l1.add("Dharwad");
        l1.add("Udupi");
        System.out.println(l1);

        l1.add(0,"Hubli");
        System.out.println(l1);

        l1.remove(0);
        System.out.println(l1);

        l1.remove(new String("Udupi"));
        System.out.println(l1);

        l1.clear(); //remove all
        System.out.println(l1);


    }
}
