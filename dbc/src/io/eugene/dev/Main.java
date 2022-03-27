package io.eugene.dev;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/*
 * Dealing with JDBC
 * 1.Import driver package
 * 2.Load and Register the driver
 * 3.Create a connection object/Establish Connection
 * 4.Create a statement object
 * 5.Execute Query
 * 6.Process result
 * 7.Close statement object
 * */

public class Main {

    public static void main(String[] args) {
        DBConnect connect = new DBConnect();
        connect.connect();
        try {
            Statement st = connect.con.createStatement();
            ResultSet results = st.executeQuery("select * from registration");

            while (results.next()) {
                System.out.println(results.getString("fname"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
