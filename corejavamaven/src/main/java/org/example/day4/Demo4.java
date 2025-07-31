package org.example.day4;

class GTest1<T>{
    T a;
    T b;
    public void setData(T x,T y){
        a=x;
        b=y;
    }
    public void display(){
        System.out.println(a+"........."+b);
    }
}
class GTest2<T1,T2>{
    T1 a;
    T2 b;
    public void setData(T1 x,T2 y){
        a=x;
        b=y;
    }
    public void display(){
        System.out.println(a+"........."+b);
    }
}

public class Demo4 {

    public static void main(String[] args) {
        GTest1<Integer> obj1=new GTest1<>();
        obj1.setData(10,20);
        obj1.display();
        GTest1<String> obj2=new GTest1<>();
        obj2.setData("Hello","Class");
        obj2.display();

        GTest2<String,Integer> obj3=new GTest2<>();
        obj3.setData("Bengaluru",10000000);
        obj3.display();
        GTest2<String,String> obj4=new GTest2<>();
        obj4.setData("Bengaluru","Karnataka");
        obj4.display();
    }
}
