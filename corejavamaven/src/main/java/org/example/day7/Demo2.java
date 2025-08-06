package org.example.day7;

import org.example.day1.Read;

import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Demo2 {
    public static void main(String[] args) throws  Exception{
        ReadBuffer.writeSCR("Enter file name with the Path(to read):");
        String f1=ReadBuffer.readKeyboard();
        ReadBuffer.writeSCR("Enter file name with the Path (to write)");
        String f2=ReadBuffer.readKeyboard();
        BufferedReader fr=(BufferedReader)ReadBuffer.openFile(f1,'r');
        BufferedWriter fw=(BufferedWriter)ReadBuffer.openFile(f2,'w');

        String s1;
        while ((s1=ReadBuffer.readFile(fr))!=null){
            String[] s2=s1.split(",");
//            ReadBuffer.writeSCR(s1);
            int sum=0;

            for (String x:s2){
                sum=sum+Integer.parseInt(x);
            }

            ReadBuffer.writeFile(s1+"="+sum,fw);
            fw.newLine();
        }
         ReadBuffer.closeFile(fr,'r');
         ReadBuffer.closeFile(fw,'w');
        System.out.println("\nProcessing over.......");

    }
}
