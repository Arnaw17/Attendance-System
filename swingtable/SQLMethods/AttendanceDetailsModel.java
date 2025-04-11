/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingtable.SQLMethods;

public class AttendanceDetailsModel {
    
    String name,mail,date, time, atendance;

    public AttendanceDetailsModel(String name, String mail, String date, String time, String atendance) {
        this.name = name;
        this.mail = mail;
        this.date = date;
        this.time = time;
        this.atendance = atendance;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getAtendance() {
        return atendance;
    }



    
    
}
