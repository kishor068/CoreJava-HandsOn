package org.example.day3;

import org.example.day1.Read;

public abstract class ArithmeticOne {

    public int num1;
    public int num2;
    public int result;
    public  void read(){
        System.out.println("Enter two numbers:");
        num1= Read.sc.nextInt();
        num2=Read.sc.nextInt();
//        result=num1+num2;// goes against the principle
    }
    public void display(){

        System.out.println("Num1="+num1+" Num2="+num2+" Sum="+result);
    }


    public abstract void compute();

    public  void setData(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
}
