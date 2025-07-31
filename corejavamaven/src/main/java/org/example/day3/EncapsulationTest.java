package org.example.day3;

public class EncapsulationTest {
    private int a=10;
    int b=20; // default
    protected static int c=30;
    public int d=40;

    public EncapsulationTest(){

    }

    private void f1(){
        System.out.println("I m in F1:"+a);
    }

    void f2(){
        System.out.println("I m in F2:"+b);
    }

    protected static void f3(){
        System.out.println("I m in F3:"+c);
    }

    public void f4(){
        System.out.println("I m in F4:"+d);
    }
}
