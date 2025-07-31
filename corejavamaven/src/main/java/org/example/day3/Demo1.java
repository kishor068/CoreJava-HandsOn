package org.example.day3;

public class Demo1 {
    public static void main(String[] args) {
        EncapsulationTest obj=new EncapsulationTest();
        // a not visile==> private
//        System.out.println(obj.a);// compilation error

        //same package==> accessible
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);

//        obj.f1(); // compilation error==> private

        //same package==> accessible
        obj.f2();
        obj.f3();
        obj.f4();
    }
}
