package com.cc.java;

import java.sql.Connection;
import java.sql.ResultSet;

public class App 
{
 // Argumente für Connection-Parameter
    static String conURL = "jdbc:mysql://172.104.240.94:3306/mydb";
    static String usrStr = "remote_user";
    static String usrPwd = "pass@remote";
        
    static Connection con;
    //static Statement stmt;
    static ResultSet rs;

    public static void main(String[] args) {

    try {
            
        // Load SQL Server JDBC driver and establish connection.
        System.out.print("Verbindung wird aufgebaut ... ");



        } catch (Exception e) {

            // TODO: handle exception
        }



    }
    
}


