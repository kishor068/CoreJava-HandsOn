package org.example.day2;

class P1{
    public P1(){
        System.out.println("I m in Zero Arg P1");
    }
    public P1(int x){
        System.out.println("P1 one arg "+x);
    }
}
public class PractiseConstructor  extends P1{


    {
        System.out.println("I m  in anonymous 1");
    }

    public  PractiseConstructor(int a){
//        super();//Calling the default costructor
        System.out.println("I m in One Argument Constructor");
    }
    public  PractiseConstructor(){
        super();// call the super class constructor
        System.out.println("I m in Zero Argument Constructor");
    }

    public void f1(){
        System.out.println("I m in f1");
    }
    {
        System.out.println("In bottom anonymous");
    }
    static {
        System.out.println("In static block");
    }


}
