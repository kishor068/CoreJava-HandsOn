package org.example.day3;

public class Demo2 {
    public static void main(String[] args) {
        //biding=> based on data compiler will call the resp datatype methods
        // obj ref not stored ==> goes to gc
        System.out.println(new Add().getAdd("10","20"));

    }
}
