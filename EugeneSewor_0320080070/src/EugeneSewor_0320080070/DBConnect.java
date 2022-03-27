package EugeneSewor_0320080070;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class DBConnect {
    /*
     * Dealing with JDBC
     * 1.Import driver package
     * 2.Load and Register the driver
     * 3.Create a connection object/Establish Connection
     * 4.Create a statement object
     * 5.Execute Query:
     *      DDL
     *      DQL
     *      DML
     * 6.Process result
     * 7.Close statement object
     * */
    private Connection connector;
    private Statement statement;
    private String query;
    private int rowsAffected;
    private ResultSet results;

    public DBConnect() throws SQLException,ClassNotFoundException {
        //        establishing connection to db
        // this establishes a connection once instantiated
        Class.forName("com.mysql.cj.jdbc.Driver");
        connector = DriverManager.getConnection("jdbc:mysql://localhost:3306/patients_db","root", "eugenedev");
        System.out.println("DB connected");
    }

    //     create statement object that allows for writing sql queries.








/* method to fetch data from database, a DQL */
    public void fetchData() throws SQLException{
        //            create statement object that allows for writing sql queries.
        statement = connector.createStatement();
        query = "select * from records";
        results = statement.executeQuery(query);
        while (results.next()){
//                do something to each row of results
            System.out.println("<<<<<"+results.getString("pname")+results.getString("id")+">>>>>");
        }
        statement.close();
    }

    public ArrayList fetchOne(String Id) throws SQLException {
        statement = connector.createStatement();
        query = "select * from records where id ='" + Id + "'";
        results = statement.executeQuery(query);
        ArrayList<String> patientData = null;


            while (results.next()) {
                System.out.println("<<<<<" + results.getString(1) + " " + results.getString(2) + " " + results.getString(3) + " " + results.getString(4) + " " + results.getString(5) + ">>>>>");
                patientData = new ArrayList<>();
                patientData.add(results.getString(2));
                patientData.add(results.getString(3));
                patientData.add(results.getString(4));
                patientData.add(results.getString(5));

            }
        statement.close();
        return patientData;

    }

    /* method to insert data into database, a DML */

    public void addData(String id,String name, int age,double temperature, String pressure) throws SQLException{
        //            create statement object that allows for writing sql queries.
        statement = connector.createStatement();
        query = "insert into records values('"+id+"','"+name+"','"+age+"','"+temperature+"','"+pressure+"')";
        rowsAffected = statement.executeUpdate(query);
        affected(rowsAffected," added");
        statement.close();

    }

    /*update data*/
    public void updateRecord(String id,String name, int age,double temperature, String pressure) throws SQLException{
        //            create statement object that allows for writing sql queries.
        statement = connector.createStatement();
        query = "update records set name = '"+name+"',age ='"+age+"',temperature = '"+temperature+"', bp = '"+ pressure+"' where id ='"+id+"'";
        rowsAffected = statement.executeUpdate(query);
        affected(rowsAffected," updated");
        statement.close();

    }
    /* method to delete particular record */
    public void deleteData(String pid) throws SQLException{
        statement = connector.createStatement();
        query = "delete from records where id = '"+pid+"'";
        rowsAffected = statement.executeUpdate(query);
        affected(rowsAffected," deleted");

    }

//    just a message box
    public void affected(int affectedRows, String message){
        if (affectedRows>0){
            System.out.println(rowsAffected+" row/s affected");
            JOptionPane.showMessageDialog(null, affectedRows+" row/s affected \n"+affectedRows+" "+message+"successfully","Patient's Record",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
