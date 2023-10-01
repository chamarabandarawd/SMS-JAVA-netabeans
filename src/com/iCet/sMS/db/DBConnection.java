/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iCet.sMS.db;

/**
 *
 * @author chama
 */
public class DBConnection {
    private static DBConnection dBConnection;

    private StudentDB studentDB;

    public DBConnection() {
        studentDB=new StudentDB();
    }
    public StudentDB getStudentDB(){
        return this.studentDB;
    }
    public static DBConnection getInstance(){
        if(dBConnection ==null){
            dBConnection=new DBConnection();
        }
        return dBConnection;
    }
    
    
}
