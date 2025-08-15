package org.example.day8;
//import com.mysql.cj.protocol.Resultset;

import java.sql.*;
public class jdbc {
    public static void main(String[] args) {
        try{
//            System.out.println();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection co=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/school",
                    "root",
                    "pass@word1");
            System.out.println("OK");
            PreparedStatement pr=co.prepareStatement("select * from student");
            ResultSet rs=pr.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getString(2));
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
