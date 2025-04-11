/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingtable.SQLMethods;

/**
 *
 * @author SKSUM
 */
public class selectedDataModel {
    
    String name,mail,ph,pass,gen;

    public selectedDataModel(String name, String mail, String ph, String pass, String gen) {
        this.name = name;
        this.mail = mail;
        this.ph = ph;
        this.pass = pass;
        this.gen = gen;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String getPh() {
        return ph;
    }

    public String getPass() {
        return pass;
    }

    public String getGen() {
        return gen;
    }
    
    
    
    
}
