package org.example.day3;

import org.example.day1.*;

public class Demo5 {
    public static void main(String[] args) {
        //creates array of references
        Arithmetic obj1[]=new Arithmetic[4];  // delegates
        obj1[0]=new Addition();
        obj1[1]=new Substraction();
        obj1[2]=new Multiplication();
        obj1[3]=new Division();
        System.out.println("Enter choice and 2 numbers:");
        int ch=Read.sc.nextInt();

        obj1[ch-1].setData(Read.sc.nextInt(),Read.sc.nextInt());
//        System.out.println();
        long startTime=System.currentTimeMillis();
        System.out.println("Process begins:"+startTime);
        obj1[ch-1].compute();

        obj1[ch-1].display();
        long endTime=System.currentTimeMillis();
        System.out.println("Process Ends:"+endTime);
        System.out.println("Total Duration:"+(endTime-startTime));


    }
}
