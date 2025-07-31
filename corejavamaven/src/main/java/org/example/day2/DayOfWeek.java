package org.example.day2;

public enum DayOfWeek {

    sunday("sun","orange"),
    monday("Moon","White"),
    tuesday("Mars","Red"),
    wednesday("Mercury","Green"),
    thursday("Jupiter","Yellow"),
    friday("Venus","White"),
    saturday("Saturn","Blue");

    String owner;
    String color;
    DayOfWeek(String x,String y)
    {
        owner=x;
        color=y;
    }
    public  void display(){
        System.out.println("Owner="+owner+" Color="+color);
    }
}
