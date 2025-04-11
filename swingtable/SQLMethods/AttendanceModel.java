/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingtable.SQLMethods;

public class AttendanceModel {
    
    String name,mob,email,date,time;
    boolean attendance;

    public AttendanceModel(String name, String mob, String email, String date, String time, boolean attendance) {
        this.name = name;
        this.mob = mob;
        this.email = email;
        this.date = date;
        this.time = time;
        this.attendance = attendance;
    }

    public String getName() {
        return name;
    }

    public String getMob() {
        return mob;
    }

    public String getEmail() {
        return email;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public boolean isAttendance() {
        return attendance;
    }

  
    
    
    
    
}
