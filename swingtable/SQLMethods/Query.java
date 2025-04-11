/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingtable.SQLMethods;

public class Query {
    
    public static String insertData = "INSERT INTO user(name, email, ph,pasword,gender) VALUES (?,?,?,?,?)";
                                           
    public static String updateData = "UPDATE user SET name=?,email=?,ph=?,pasword=?,gender=? WHERE id=?";
    
    public static String fetchData = "SELECT id,name, email, ph, pasword, gender FROM user";
    
    public static String insertAttendance = "INSERT INTO attendance (name, mob, email, date,time, attendance) VALUES (?, ?, ?, ?, ?,?)";
    
    public static String attendaceDetails ="SELECT name,email, mob,date, time,attendance, " +
             "CASE " +
             "    WHEN attendance = 1 THEN 'Present' " +
             "    ELSE 'Absent' " +
             "END as attendance_status " +
             "FROM attendance " +
             "WHERE email = ? " +
             "AND date BETWEEN ? AND ?";
    
    public static String selectedData = "SELECT name, email, ph, pasword, gender FROM user WHERE id=?";
    
    public static String delete = "DELETE FROM user WHERE id=?";
    
}
