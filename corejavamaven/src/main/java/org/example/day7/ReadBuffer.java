package org.example.day7;

import java.io.*;
import java.nio.Buffer;

public class ReadBuffer {
    public static String readKeyboard() throws Exception{
        try {

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            return br.readLine();
        }catch (Exception e){
            throw new NumberFormatException();
        }
    }

    public static void writeSCR(String s1) throws Exception{
        try {

            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
             bw.write(s1);
             bw.flush();
        }catch (Exception e){
            throw new NumberFormatException();
        }
    }


    public static Object openFile(String filePath,char mode) throws Exception{
        try {
            if(mode=='r') {
                BufferedReader br = new BufferedReader(new FileReader(filePath));
                return br;
            }
            if(mode=='w') {
                BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
                return bw;
            }

        }catch (Exception e){
            throw new FileNotFoundException();
        }
        return null;
    }

    public static void closeFile(Object br,char mode) throws Exception{
        try {
            if(mode=='r') ((BufferedReader)br).close();
            if(mode=='w')((BufferedWriter)br).close();
        }catch (Exception e){
            throw new NumberFormatException();
        }
    }

    public static void writeFile(String s1,BufferedWriter bw) throws Exception{
        try {

//            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

            bw.write(s1);
            bw.flush();
        }catch (Exception e){
            throw new NumberFormatException();
        }
    }

    public static String readFile(BufferedReader br) throws Exception{
        try {

            return  br.readLine();
        }catch (Exception e){
            throw new NumberFormatException();
        }
    }


}
