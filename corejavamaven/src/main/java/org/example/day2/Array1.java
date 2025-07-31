package org.example.day2;

import org.example.day1.Read;

import java.util.Arrays;

public class Array1 {
    int arr[]; //array declaration
    public Array1(){
        arr=new int[10];
    }
    public Array1(int n){
        arr=new int[n];
    }
    public Array1(int n[]){
        arr=n;
    }
    public  void readArray(){
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= Read.sc.nextInt();
        }
    }

    public void displayHorizontal(){
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public void displayV(){
        for(int x:arr)
        {
            System.out.println(x+" ");
        }
//        System.out.println();
    }

    public void sort(){
        Arrays.sort(arr);
        displayHorizontal();
    }
}
