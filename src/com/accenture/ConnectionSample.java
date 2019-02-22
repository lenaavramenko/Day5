package com.accenture;

//Needs to be completed
import java.net.URL;
import java.sql.*;

public class ConnectionSample {

    //    This source code tries to establish a connection to a MySQL server
    //    and displays a message concerning the error if connection fails
    public static void main(String[] args) {



        try {
            String url = "jdbc:mysql://localhost/activity";
            String user = "root";
            String pass = "123456";

            //1 - Load the driver
            Class.forName("com.mysql.jdbc.Driver");

            //2 - Obtain a connection using DriverManager class
            Connection cn = DriverManager.getConnection(url, user, pass);
            Statement myStatement = cn.createStatement();
            myStatement.executeQuery("Select * from employee");
            System.out.println("Connection successfully established! \n");


            //Closing the connection
            cn.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}