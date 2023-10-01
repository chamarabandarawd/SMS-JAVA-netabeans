/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iCet.sMS.db;

import com.iCet.sMS.model.Student;

/**
 *
 * @author chama
 */
public class StudentDB {

    class Node {

        private Student student;
        private Node next;

        public Node(Student student) {
            this.student = student;
        }
    }

    private Node frist;
    private int size = 0;

    public boolean add(Student student) {
        Node nextStudent = new Node(student);
        if (frist == null) {
            frist = nextStudent;
            size++;

        } else {
            Node last = frist;
            while (last.next != null) {
                last = last.next;
            }
            last.next = nextStudent;
            size++;
        }
        return true;
    }

    public int search(Student student) {
        int index = 0;
        if (frist.student.equals(student)) {
            return index;
        }
        Node last = frist;
        while (last.next != null) {
            last = last.next;
            index++;
            if (last.student.equals(student)) {
                return index;
            }
        }
        return -1;
    }

    public Student search(String id) {
        Node current = frist;
        while (current != null) {
            if (current.student.getId().equalsIgnoreCase(id)) {
                return current.student;
            }
            current = current.next;
        }
        return null;
    }

    public boolean remove(String id) {
        if (frist.student.getId().equalsIgnoreCase(id)) {
            frist = frist.next;
            size--;
            return true;
        } else {
            Node previous = frist;
            Node current = frist.next;
            while (current != null) {
                if (current.student.getId().equalsIgnoreCase(id)) {
                    previous.next = current.next;
                    size--;
                    return true;
                }
                previous = current;
                current = current.next;
            }

        }
        return false;
    }

    public Student[] toArray() {
        Student[] tempArray = new Student[size];
        Node current = frist;
        for (int i = 0; i < size; i++) {
            tempArray[i] = current.student;
            current = current.next;
        }
        return tempArray;
    }

}
