package org.example.day2;

import org.example.day1.Read;

public class Demo5 {
    public static void main(String[] args) {
        System.out.println("Enter day of the week");
        String s1= Read.sc.nextLine();

        DayOfWeek ob=DayOfWeek.valueOf(s1);
        ob.display();
    }
}
