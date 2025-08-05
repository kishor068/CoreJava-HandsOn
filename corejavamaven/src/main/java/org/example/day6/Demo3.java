package org.example.day6;
public class Demo3 {
    public static void main(String[] args) {
        String s1="Bangalore";
        String s2="Bangalore";
        String s3=new String("Bangalore");// crestes new obj==> mew referemce
        s1=s1+"Karnataka";
        //== checks for referremce
        // .equals checks for the value

        //same refference
        if(s1==s2){
            System.out.println("yes");
        }else {
            System.out.println("No");
        }

        if(s1==s3){
            System.out.println("yes");
        }else {
            System.out.println("No");
        }

        if(s1.equals(s2)){
            System.out.println("yes");
        }else {
            System.out.println("No");
        }

        if(s1.equals(s3)){
            System.out.println("yes");
        }else {
            System.out.println("No");
        }

        //Program to check 2 employee obj's are same or not

    }
}
