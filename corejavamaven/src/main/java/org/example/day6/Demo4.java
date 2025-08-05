package org.example.day6;


public class Demo4 {
    public static void main(String[] args) {
        Employee e1=new Employee(1001,"Varun");
        Employee e2=new Employee(1002,"Raju");
        Employee e3=new Employee(1001,"Varun");
        Employee e4=e2;
        if(e1==e2){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

        if(e1==e3){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }


        if(e1.equals(e2)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

        if(e1.equals(e3)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        if(e2.equals(e4)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
