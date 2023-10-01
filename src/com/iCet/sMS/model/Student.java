/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iCet.sMS.model;

/**
 *
 * @author chama
 */
public class Student {
    private String id;
    private String name;
    private double PRFMarks;
    private double DBMSMarks;

    public Student() {
    }

    public Student(String id, String name, double PRFMarks, double DBMSMarks) {
        this.id = id;
        this.name = name;
        this.PRFMarks = PRFMarks;
        this.DBMSMarks = DBMSMarks;
    }

    @Override
    public boolean equals(Object obj) {
        Student s1=(Student)obj;
        return this.id.equalsIgnoreCase(s1.id); 
    }
   
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the PRFMarks
     */
    public double getPRFMarks() {
        return PRFMarks;
    }

    /**
     * @param PRFMarks the PRFMarks to set
     */
    public void setPRFMarks(double PRFMarks) {
        this.PRFMarks = PRFMarks;
    }

    /**
     * @return the DBMSMarks
     */
    public double getDBMSMarks() {
        return DBMSMarks;
    }

    /**
     * @param DBMSMarks the DBMSMarks to set
     */
    public void setDBMSMarks(double DBMSMarks) {
        this.DBMSMarks = DBMSMarks;
    }
    
    
}
