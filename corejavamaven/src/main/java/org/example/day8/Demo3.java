package org.example.day8;

import org.example.day7.ReadBuffer;
import java.io.*;
public class Demo3 {
    public static void main(String[] args) {
        try {
            System.out.println("Enter file:");
            String f1=ReadBuffer.readKeyboard();
            File file=new File(f1);
            if (file.exists()){
                if(file.isDirectory()){
                    System.out.println("Given is a directory");
                    String[] arr=file.list();
                    for (String x:arr){
                        System.out.println(x);
                    }
                }else{
                    System.out.println("Given is a file");
                }
            }else {
                System.out.println("File doesn't exist!");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
