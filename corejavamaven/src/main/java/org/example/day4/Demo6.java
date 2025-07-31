package org.example.day4;
import java.util.*;
public class Demo6 {
    public static void main(String[] args) {
//        ArrayList<Integer> obj1=new ArrayList<>(); //Tightly coupled
        List<Integer> obj1=new ArrayList<>();
        obj1.add(10);
        obj1.add(20);
        obj1.add(30);
        obj1.add(40);
        obj1.add(50);
        obj1.add(60);
        obj1.add(70);
        System.out.println(obj1);
        System.out.println("Using for loop");
        for (int x:obj1){
            System.out.print(x+" ");
        }
        System.out.println("Using Index");
        for(int i=0;i<obj1.size();i++){
            System.out.print(obj1.get(i)+" ");
        }
        System.out.println("Using method refernce:");
        obj1.forEach(System.out::println);
        System.out.println();
        System.out.println("Using static method reference");
        obj1.forEach(Demo6::f1);
        System.out.println();

        Demo6 obj2=new Demo6();
        System.out.println("Using Instance method refference");
        obj1.forEach(obj2::f2);

        System.out.println("\n\nUsing Lambda expression for a method called forEach");
        obj1.forEach((x)->{
            System.out.println(x);
        });
        System.out.println("\n\nUsing sort:");
        Collections.sort(obj1);
        obj1.forEach(System.out::println);
    }
    public static void f1(Integer x){
        Integer y=x*x;
        System.out.print(x+"-->"+y+" ");
    }
    public void f2(Integer x){
        Double y=Math.sqrt(x);
        System.out.print(x+"-->"+y+" ");

    }
}
