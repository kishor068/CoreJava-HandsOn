package org.example.day7;

public class Demo1  {
    public static void main(String[] args) throws Exception {
        ReadBuffer.writeSCR("Enter two numbers:");
        int a=Integer.parseInt(ReadBuffer.readKeyboard()) ;
        int b=Integer.parseInt(ReadBuffer.readKeyboard());
        int c=a+b;
        ReadBuffer.writeSCR(String.valueOf(c));
//        System.out.println(c);
    }
}
