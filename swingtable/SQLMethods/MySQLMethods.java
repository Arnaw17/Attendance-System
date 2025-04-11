/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingtable.SQLMethods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class MySQLMethods {
    

    
    public void insertdata(String n,String e,String no,String pass,String g)
    {
        Connection con = DbConnection.connect();
        String qry = Query.insertData;
        try
        {
            PreparedStatement st = con.prepareStatement(qry);
            
            st.setString(1, n);
            st.setString(2, e);
            st.setString(3, no);
            st.setString(4, pass);
            st.setString(5, g);
     
            st.executeUpdate();
            
            System.out.println("Your data inserted successfully");
            con.close();
            st.close();    
        }
        catch(Exception ex) {System.out.println(ex.getMessage());}
        
    }
    
    public void updatedata(String n,String e,String no,String pass,String g,int id)
    {
        Connection con = DbConnection.connect();
        String qry = Query.updateData;
        
        try
        {
            PreparedStatement st = con.prepareStatement(qry);

            st.setString(1, n);
            st.setString(2, e);
            st.setString(3, no);
            st.setString(4, pass);
            st.setString(5, g);
            st.setInt(6, id);
     
            st.executeUpdate();
            
            System.out.println("Your data updated successfully");
            con.close();
            st.close();    
        }
        catch(Exception ex) {System.out.println(ex.getMessage());}
        
    }
    
    public void deletedata(int id)
    {
        DbConnection obj = new DbConnection();
        Connection con = obj.connect();
        
        String qry = Query.delete;
     
        try
        {
            
            PreparedStatement st = con.prepareStatement(qry);

            st.setInt(1, id);
     
            st.executeUpdate();
            
            System.out.println("Your data deleted successfully");
            con.close();
            st.close();    
        }
        catch(Exception e) {System.out.println(e.getMessage());}
    }
    
    
    public ArrayList<DataModel> datafetch()
    {
        DataModel data ;
        ArrayList<DataModel> arr = new ArrayList();
        Connection con = DbConnection.connect();
        String qry = Query.fetchData;
        //String qry = "SELECT id, uname, upas, umail FROM studentdata";
        try
        {
            //Connection con = DriverManager.getConnection(url,user,pas);
            Statement st = con.createStatement();
            
            ResultSet resultset = st.executeQuery(qry);
            
            
             while(resultset.next())
             {
                 String id = String.valueOf(resultset.getInt("id"));
                 String name = resultset.getString("name");
                 String mail = resultset.getString("email");
                 String ph = resultset.getString("ph");
                 String pass = resultset.getString("pasword");
                 String gen = resultset.getString("gender");
                 
                 data = new DataModel(id,name,mail,ph,pass,gen);
                 
                 arr.add(data);
                        
             }

            System.out.println("Your data feched successfully");
            con.close();
            st.close();  
            
            
        }
        catch(Exception e) {System.out.println(e.getMessage());}
        
        return arr;
    }
    
    public void attendance(ArrayList x)
    {
        
        ArrayList<AttendanceModel> users = x;
        
        Connection con = DbConnection.attendanceconncet();
        String qry = Query.insertAttendance;
        
        
         try
         {
            PreparedStatement st = con.prepareStatement(qry);
            
//       name,mob,email,date,time,attendance

            for (int i=0; i<users.size();i++) 
            {
                //System.out.println(users.get(i).getMob());
                st.setString(1, users.get(i).getName());
                st.setString(2, users.get(i).getMob());
                st.setString(3, users.get(i).getEmail());
                st.setString(4, users.get(i).getDate());
                st.setString(5, users.get(i).getTime());
                st.setBoolean(6, users.get(i).isAttendance());
                
                st.addBatch();
            }
     
            st.executeBatch();
            
            System.out.println("Your data inserted successfully");
            con.close();
            st.close();    
        }
        catch(Exception ex) {System.out.println("Methods: "+ex.getMessage());}
        
        
    }
    
    
    public ArrayList attendaceDetails(String mail,String frdt,String todt)
    {
        AttendanceDetailsModel data;
        ArrayList<AttendanceDetailsModel> arr = new ArrayList();
        
        Connection con = DbConnection.attendanceconncet();
        String qry = Query.attendaceDetails;
        
        
         try
        {
           PreparedStatement pstmt = con.prepareStatement(qry);
            pstmt.setString(1, mail); // Replace with actual email
            pstmt.setString(2, frdt); // Replace with actual start date
            pstmt.setString(3, todt); // Replace with actual end date

            ResultSet resultset = pstmt.executeQuery();
            
//            Statement st = con.createStatement();
//            
//            ResultSet resultset = st.executeQuery(qry);
            
            //name,mail,fromdate, todate, atendance
             while(resultset.next())
             {
//                 System.out.println(resultset.getString("name"));
//                 System.out.println(resultset.getString("attendance"));
                 
                 String name = resultset.getString("name");
                 String Email = resultset.getString("email");
                 String date = resultset.getString("date");
                 String time = resultset.getString("time");
                 String attendance = resultset.getString("attendance");
                 
                 data = new AttendanceDetailsModel(name,Email,date,time,attendance);
                 
                 arr.add(data);
                        
             }

            System.out.println("Your data feched successfully");
            con.close();
            pstmt.close();  
            
            
        }
        catch(Exception e) {System.out.println(e.getMessage());}
        
        return arr;
    }
    
    
    public ArrayList selectedData(int id)
    {
        selectedDataModel data ;
        ArrayList<selectedDataModel> arr = new ArrayList() ;
        
        
        
        Connection con = DbConnection.connect();
        String qry = Query.selectedData;
        //String qry = "SELECT id, uname, upas, umail FROM studentdata";
        try
        {
            //Connection con = DriverManager.getConnection(url,user,pas);
            PreparedStatement st = con.prepareStatement(qry);
            
            st.setInt(1,id);
            
            
            ResultSet resultset = st.executeQuery();
            
            
             while(resultset.next())
             {
                 System.out.println(resultset.getString("name")+resultset.getString("gender"));
                 
                 String name = resultset.getString("name");
                 String mail = resultset.getString("email");
                 String ph = resultset.getString("ph");
                 String pass = resultset.getString("pasword");
                 String gen = resultset.getString("gender");
                 
                 data = new selectedDataModel(name,mail,ph,pass,gen);
                 
                 arr.add(data);
                        
             }

            System.out.println("Your data feched successfully");
            con.close();
            st.close();  
            
            
        }
        catch(Exception e) {System.out.println(e.getMessage());}
        
        return arr;
    }
}
