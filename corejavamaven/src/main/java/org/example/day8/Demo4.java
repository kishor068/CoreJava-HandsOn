package org.example.day8;

import org.example.day7.ReadBuffer;

import java.io.File;
import java.io.RandomAccessFile;

public class Demo4 {
    public static void main(String[] args) {
        //Random access files and bufferedImages need fileApi.
        long fp=0L;

        try {
            System.out.println("Enter the file to be updated:");
            String s1= ReadBuffer.readKeyboard();
            File file=new File(s1);
            RandomAccessFile rm=new RandomAccessFile(file,"rw");
            int ch;
            while ((ch=rm.read())!=-1){
                if(ch==97){
                    rm.seek(fp);
                    rm.write(65);
                }
                fp++;
            }
            rm.close();
            System.out.println("Your file is processed...........");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
