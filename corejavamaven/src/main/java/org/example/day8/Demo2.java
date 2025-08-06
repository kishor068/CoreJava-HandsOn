package org.example.day8;

import org.example.day7.ReadBuffer;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo2 {
    public static void main(String[] args) {
        try {
            System.out.println("Enter source file name:");
            String f1= ReadBuffer.readKeyboard();
            System.out.println("Enter target file name:");
            String f2= ReadBuffer.readKeyboard();
            FileInputStream fileOne=new FileInputStream(f1);
            FileOutputStream fileTwo=new FileOutputStream(f2);
            int ch;
            int i=0;
            while ((ch=fileOne.read())!=-1){
                if(i<=500){
                    fileTwo.write(ch);
                    i++;
                }else {
                    fileTwo.write(ch);
//                    fileTwo.write(0);
//                    fileTwo.write(0);
                    fileTwo.write(ch);
                    fileTwo.write(ch);
                    fileOne.read();
                    fileOne.read();

                }
            }
            System.out.println("Process over.............");
            fileOne.close();
            fileTwo.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    }

