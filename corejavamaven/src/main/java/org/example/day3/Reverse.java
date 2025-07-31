package org.example.day3;

public class Reverse {
    public  int reverse(int n){
        return Integer.parseInt(reverse(String.valueOf(n)));
    }
    public String reverse(String n){
        return new StringBuffer(n).reverse().toString();
    }
    public long reverse(long n){
        return Long.parseLong(reverse(String.valueOf(n)));
    }
    public float reverse(float n){

        String s1=String.valueOf(n);

        String parts[]=s1.split("\\.");
        String s2=reverse(parts[0]);
        String s3=reverse(parts[1]);
        return Float.parseFloat((s2+"."+s3));

    }
}
