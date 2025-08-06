package org.example.day8;

import org.example.day7.ReadBuffer;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo1 {
    public static void main(String[] args) {
        try {
            System.out.println("Enter source file name:");
            String f1= ReadBuffer.readKeyboard();
            System.out.println("Enter target file name:");
            String f2= ReadBuffer.readKeyboard();
            FileInputStream fileOne=new FileInputStream(f1);
            FileOutputStream fileTwo=new FileOutputStream(f2);
            int ch;
            while ((ch=fileOne.read())!=-1){
                System.out.print((char)ch);
                fileTwo.write(ch);
            }
            fileOne.close();
            fileTwo.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
