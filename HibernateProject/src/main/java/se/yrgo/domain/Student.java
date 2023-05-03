package se.yrgo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String enrollmentID;
    private String name;

    public Student(String name, String enrollmentID) {
        this.name = name;
        this.enrollmentID = enrollmentID;

    }

    public Student() {

    }

    public Student(String name) {
        this.name = name;

    }

    public String toString() {
        return "name :" + name;
    }

    public int getId() {
        return id;
    }

    public String getEnrollmentID() {
        return enrollmentID;
    }
}
