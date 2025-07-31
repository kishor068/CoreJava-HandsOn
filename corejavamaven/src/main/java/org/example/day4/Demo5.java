package org.example.day4;

import java.util.function.Predicate;

public class Demo5 {
    public static void main(String[] args) {
        // functional interface with generics
        Predicate<Integer> obj1=(x)->{
            if(x%2==0) return true;
            else return false;
        } ;

        System.out.println(obj1.test(25));
    }

}

//Implementation of Predicate using class(instead of using lambda expression)
 class T1<Integer> implements Predicate<Integer>{

     @Override
     public boolean test(Object o) {
         Integer x=(Integer) o;
         if((int)x%2==0)return  true;
         else return false;
     }
 }