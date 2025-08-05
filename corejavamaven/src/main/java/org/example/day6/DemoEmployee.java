package org.example.day6;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DemoEmployee {
    public static void main(String[] args) {
        Map<Integer,Employee> emp=new HashMap<>();
        emp.put(1001,new Employee(1001,"Harish"));
        emp.put(1002,new Employee(1002,"Srujan V Bhat"));
        emp.put(1003,new Employee(1003,"SP Pratham"));

        Integer e1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ID:");
        e1=sc.nextInt();

        try{
            if(emp.get(e1)==null) throw new Exception();
            System.out.println(emp.get(e1));
        }catch (Exception e){
            System.out.println("Employee does not exist!");
        }
    }
}
