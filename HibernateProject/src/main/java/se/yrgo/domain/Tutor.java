package se.yrgo.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import javax.annotation.processing.Generated;

//import org.hibernate.mapping.List;

//import org.hibernate.mapping.Map;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKey;
import jakarta.persistence.OneToMany;

@Entity
public class Tutor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String tutorId;
    private String name;
    private int salary;

    @OneToMany
    @MapKey(name = "enrollmentID")
    @JoinColumn(name = "TUTOR_FK")
    private List<Student> teachingGroup;

    public Tutor() {

    }

    public Tutor(String tutorId, String name, int salary) {
        this.tutorId = tutorId;
        this.name = name;
        this.salary = salary;
        this.teachingGroup = new ArrayList<Student>();
    }

    public String getTutorId() {
        return tutorId;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void addStudentToTeachingGroup(Student newStudent) {
        this.teachingGroup.add(id, newStudent);
    }

    public List<Student> getTeachingGroup() {
        List<Student> unmodifiable = Collections.unmodifiableList(this.teachingGroup);
        return unmodifiable;
    }

    @Override
    public String toString() {
        return "Tutor [tutorId=" + tutorId + ", name=" + name + ", salary=" + salary + "]";
    }

}
