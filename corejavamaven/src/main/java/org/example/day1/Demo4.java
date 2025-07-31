package org.example.day1;

public class Demo4 {

    public static void main(String[] args) {
        Addition obj1=new Addition();
        obj1.setData(20,40);
        obj1.compute();
        obj1.display();
        obj1=new Addition();
        obj1.display();
        obj1=null;

        Demo4 obj2=new Demo4();
//        int x=0; //method scope
        System.out.println(Demo4.x);
        obj2.f1();

    }
    static  int  x=20;
    public  void f1(){
        System.out.println("I m in F1");
    }
}
