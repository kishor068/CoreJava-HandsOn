package org.example.day5;

import java.time.LocalDate;
import java.util.Comparator;

public class EmployeeTo implements Comparable<EmployeeTo> {
    private  String name;
    private LocalDate dob;
    private String city;

    public EmployeeTo(String city, LocalDate dob, String name) {
        this.city = city;
        this.dob = dob;
        this.name = name;
    }
    public  EmployeeTo(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", city='" + city  ;
    }


//    @Override
//    public int compare(Object o1, Object o2) {
//        if (o1 instanceof EmployeeTo && o2 instanceof EmployeeTo){
//            return ((EmployeeTo)o1).getCity().compareTo(((EmployeeTo)o2).getCity());
//        }
//        return 0;
//    }

    @Override
    public int compareTo(EmployeeTo o) {
        if (o instanceof EmployeeTo ){
//            return ((EmployeeTo)o).getCity().compareTo(this.getCity()); //Descending order
            return (this.getCity().compareTo(((EmployeeTo)o).getCity())); // ascending order
        }

        return 0;
    }
}
