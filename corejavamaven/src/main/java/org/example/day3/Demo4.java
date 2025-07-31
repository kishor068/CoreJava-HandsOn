package org.example.day3;

import org.example.day1.Addition;
import org.example.day1.Arithmetic;
import org.example.day1.Substraction;

public class Demo4 {
    public static void main(String[] args) {
//        Addition obj1=new Addition();
        Arithmetic obj1=new Addition(); //virtual functions
        obj1.setData(20,30);
        obj1.compute();
        obj1.display();
//Num1=20 Num2=30 Sum=50
        //Runtime polymorphism
        obj1=new Substraction(); //tightly coupled lhs!=rhs

        obj1.setData(20,30);
        obj1.compute();
        obj1.display();
        //Num1=20 Num2=30 Sum=-10
    }
}
