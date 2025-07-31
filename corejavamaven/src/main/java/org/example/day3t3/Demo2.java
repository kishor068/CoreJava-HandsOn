package org.example.day3t3;

public class Demo2 {
    public static void main(String[] args) {
        CalculateI obj1=(a,b)->(a%b);
        System.out.println(obj1.cal(5,2));

        obj1=(a,b)->{
            return  a/b;
        };
        System.out.println(obj1.cal(10,5));
        f1((a,b)->(a-b));
        f1((a,b)->(a+b));
    }
    public static void f1(CalculateI obj){
        System.out.println(obj.cal(10,20));
    }

}
