package org.example.day5;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoEmployee {
    public static void main(String[] args) {
        List<EmployeeTo> emp=new ArrayList<>();
        emp.add(new EmployeeTo("Bengaluru", LocalDate.of(1980, Month.FEBRUARY,10),"Arun"));
        emp.add(new EmployeeTo("Hubli", LocalDate.of(2007, Month.JULY,22),"Mahesh"));
        emp.add(new EmployeeTo("Udupi", LocalDate.of(2010, Month.DECEMBER,2),"Preethika"));
        emp.add(new EmployeeTo("Bengaluru", LocalDate.of(2013, Month.JULY,21),"Srujan V Bhat"));
        emp.add(new EmployeeTo("Moodubelle", LocalDate.of(2015, Month.JANUARY,10),"Nibha Belle"));

        emp.forEach(System.out::println);
        System.out.println("\nBelonging to Bengaluru City..............");
        emp.stream().filter((em)->(em.getCity().equals("Bengaluru"))).forEach(System.out::println);

        System.out.println("\nNames..............");
        emp.stream().map((em)->(em.getName())).forEach(System.out::println);

        System.out.println("\nEmployees Month..............");
        emp.stream().filter((em)->(em.getDob().getMonth().equals(Month.JULY))).forEach(System.out::println);

        System.out.println("\nBelonging to Bengaluru City the number of employees..............");
        long c1=emp.stream().filter((em)->(em.getCity().equals("Bengaluru"))).count();
        System.out.println("Count:"+c1);

        System.out.println("\nNames Sorted........ ");
        //Both comparator and comparable interface do the same work

        //using comparator, when lamba function is used=> comparator is used
        //Using lambda function ==> compare function is being overriden, no explicit override
        //this code provides flexibility, paramenter/args can be changed as per requirment
        Collections.sort(emp,(x,y)->(x.getName().compareTo(y.getName())));
        emp.forEach(System.out::println);

        Object ob=new EmployeeTo();
//        ob.
//        ((EmployeeTo)ob).getName();
        System.out.println("Sorted in city order");

        //here the comparable interface is used
        // here the compareTo function has to be explicitly overridden.
        //less flexibility
        Collections.sort(emp);
        emp.forEach(System.out::println);

        System.out.println("Age wise display:...............");
        emp.stream().filter((x)->(
            (Period.between(x.getDob(),LocalDate.now()).getYears()>25))).forEach(System.out::println);

    }


}
