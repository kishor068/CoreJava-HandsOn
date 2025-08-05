package org.example.day6;
import lombok.*;

import java.util.Objects;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private long empId;
    private String empString;

    //reation b/n equals and hashcode()

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//if obj ref is same
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
//        return this.empId == employee.empId && Objects.equals(empString, employee.empString);
        return this.hashCode()==o.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empString);
    }

    //    public Employee(long empId, String empString) {
//        this.empId = empId;
//        this.empString = empString;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "empId=" + empId +
//                ", empString='" + empString + '\'' +
//                '}';
//    }
}
