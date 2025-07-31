package org.example.dayt2;

public class Demo1 {
    public static void main(String[] args) {
        AddTO obj1=new AddTO();
        AddBO obj2=new AddBO();

        obj1.setNum1(10);
        obj1.setNum2(20);

        obj2.getAdd(obj1);
        System.out.println("Sum:"+obj1.getResult());
    }
}
