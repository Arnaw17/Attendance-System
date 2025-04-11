/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingtable.SQLMethods;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author SKSUM
 */
public class DbConnection {
    
    public static Connection con,con1;
    
    
    public static Connection connect()
    {
       try{
            String db = "student";
            String user = "root";  String pas = "";
            String url = "jdbc:mysql://localhost:3306/"+db;
            
           con = DriverManager.getConnection(url,user,pas);
        }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
       
       return con;
    }
    
    public static Connection attendanceconncet()
    {
        try{
            String db = "student";
            String user = "root";  String pas = "";
            String url = "jdbc:mysql://localhost:3306/"+db;
            
            con1 = DriverManager.getConnection(url,user,pas);
        }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
        
        
        return con1;
    }
    
}
