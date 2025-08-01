package org.example.day5;

import java.time.LocalDate;
import java.time.Month;

public class DemoRamzaan {
    public static void main(String[] args) {
//        LocalDate dt=new LocalDate(2025, 4,8);
        LocalDate dt=LocalDate.of(2024,4,10);
        System.out.println("Ramzaan 10 years");
        for(int i=1;i<10;i++){
            long days=12*29+6;
            dt=dt.plusDays(days);
            System.out.println(dt);
        }

        LocalDate dt1=LocalDate.of(2024,9,7);
        int flag=2;
        System.out.println("\nGanesh Chaturthi 10 years ");
        for(int i=1;i<10;i++){
            long days;
            if(flag<3){days=12*29+6;
            flag++;
            }
            else{ days=13*29+6;
            flag=1;
            }
            dt1=dt1.plusDays(days);
            System.out.println(dt1);
        }
    }
}
