package org.example.day4;

import org.example.day1.Read;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Program begins");
        int a,b,c;
        System.out.println("Enter two numbers:");

        a= Read.sc.nextInt();
        b= Read.sc.nextInt();
        try {
            c = f1(a,b);
            System.out.println("Quotient:" + c);
            return;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            return;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
        System.out.println("Program Ends");

        }
    }
    //Global or Central Exception Handling
    public static int f1(int x,int y ) throws  ArithmeticException{
        return x/y;
    }
}
