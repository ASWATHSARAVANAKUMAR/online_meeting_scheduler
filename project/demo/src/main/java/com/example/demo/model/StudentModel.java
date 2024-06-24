package com.example.demo.model;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class StudentModel {

    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int regno;
    private String studentname;
    private String studentmarks;
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "model")
    @JsonManagedReference
    private MeetingModel model;


    StudentModel(){
        
    }


    public StudentModel(int regno, String studentname, String studentmarks) {
        this.regno = regno;
        this.studentname = studentname;
        this.studentmarks = studentmarks;

    }
   
    
    
    public int getRegno() {
        return regno;
    }

    public void setRegno(int regno) {
        this.regno = regno;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentmarks() {
        return studentmarks;
    }

    public void setStudentmarks(String studentmarks) {
        this.studentmarks = studentmarks;
    }
   

}