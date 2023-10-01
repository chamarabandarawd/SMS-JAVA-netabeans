/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iCet.sMS.controller;

import com.iCet.sMS.db.DBConnection;
import com.iCet.sMS.db.StudentDB;
import com.iCet.sMS.model.Student;

/**
 *
 * @author chama
 */
public class StudentController {

    public static boolean addStudent(Student student) {
        StudentDB studentDB = DBConnection.getInstance().getStudentDB();
        return studentDB.add(student);
    }

    public static Student getById(String id) {
        StudentDB studentDB = DBConnection.getInstance().getStudentDB();
        return studentDB.search(id);
    }

    public static Student[] getAll() {
        StudentDB studentDB = DBConnection.getInstance().getStudentDB();
        return studentDB.toArray();
    }

    public static boolean deleteById(String id) {
        StudentDB studentDB = DBConnection.getInstance().getStudentDB();
        return studentDB.remove(id);
    }
}
