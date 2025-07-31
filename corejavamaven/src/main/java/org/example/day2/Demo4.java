package org.example.day2;

public class Demo4 {
    public static void main(String[] args) {
        int a=123;//decimal representation
        int b=0x45; //Prefix with=> octal 048=> error(8 not part of octal no system)
        //0x=> hexadecimal representation
        int c=0b111; // 0b=> binary representation
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
        System.out.println(Integer.toBinaryString(a));

        Integer x=a; // boxing(primitive->wrapper class)
        int d=x; //unboxing( wrapper class-> primitive)

        String s1=String.valueOf(a); //Integer -> string
        System.out.println("s1:"+s1);
        Integer x1=Integer.valueOf("1111");// String-> Integer
    }
}
