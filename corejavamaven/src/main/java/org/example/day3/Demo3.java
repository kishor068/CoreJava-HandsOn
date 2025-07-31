package org.example.day3;

public class Demo3 {
    public static void main(String[] args) {
        Reverse obj1=new Reverse();
        System.out.println(obj1.reverse(24));
        System.out.println(obj1.reverse("Hello"));
        System.out.println(obj1.reverse(65043L));
        System.out.println("In main: "+obj1.reverse(5542.235f));
        System.out.println(Float.parseFloat("2.2"));
    }
}
