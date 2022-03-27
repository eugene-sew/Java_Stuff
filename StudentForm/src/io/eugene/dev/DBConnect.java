package io.eugene.dev;

import java.sql.*;
import java.time.LocalDate;

public class DBConnect {
    Connection con;
    Statement statement;
    ResultSet results;

    public void connect() {
        try {
//            import driver and load + register
            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            establishing connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students_form", "root", "eugenedev");
            System.out.println("Success Connecting");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void makeQuery(String fname, String lname, String email, String password, LocalDate dob, String gender, String department) {

        try {
//            creating statement
            statement = con.createStatement();
//            ddl,dml,dql

            int results = statement.executeUpdate("insert into  registration(fname,lname,email,password,date_of_birth,gender,department)values"+"('"+fname+"','"+lname+"','"+email+"','"+password+"','"+dob+"','"+gender+"','"+department+"')");

            System.out.println(results + "rows affected");

            statement.close();
            con.close();

        } catch (SQLException er) {
            er.printStackTrace();
        }
    }


}
