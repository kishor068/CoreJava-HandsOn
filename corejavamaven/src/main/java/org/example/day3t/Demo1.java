package org.example.day3t;
import org.example.day3.EncapsulationTest;
public class Demo1 extends  EncapsulationTest {
    public static void main(String[] args) {
        EncapsulationTest obj=new EncapsulationTest(); //"has-a" relation
        // a not visile==> private
//        System.out.println(obj.a);// compilation error

        //same package==> accessible
//        System.out.println(obj.b);  //default
//        System.out.println(obj.c);   // protected
        System.out.println(obj.d);

//        obj.f1(); // compilation error==> private

        //same package==> accessible
//        obj.f2();//default
//        obj.f3(); //calling thro reference==> "has-a" relation
        f3();// Main static, therefore f3 needs to be static to be accessed
        obj.f4();
    }
    void test1()
    {
//        f1(); // private
//        f2();// default
        f3();// can be accessed because of inheritence("is-a" relation) ==>protected can be accessed
        f4(); //public

    }



}
