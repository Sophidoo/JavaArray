package org.example;

import java.util.List;

public class StudentModel {
    private int id;
    private String firstname;
    private String lastname;
    private String department;
    private String faculty;
    private String gender;
    private String matricNo;
    private String state;
    private int level;

    public StudentModel(int id, String fname, String lname, String dept, String faculty, String gender, String matricNo, String state, int level){
        this.id = id;
        this.firstname = fname;
        this.lastname = lname;
        this.department = dept;
        this.faculty = faculty;
        this.gender = gender;
        this.matricNo = matricNo;
        this.state = state;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMatricNo() {
        return matricNo;
    }

    public void setMatricNo(String matricNo) {
        this.matricNo = matricNo;
    }

    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
    }

    public int getLevel(){
        return level;
    }

    public void setLevel(int level){
        this.level = level;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", department='" + department + '\'' +
                ", faculty='" + faculty + '\'' +
                ", gender='" + gender + '\'' +
                ", matricNo='" + matricNo + '\'' +
                ", state='" + state + '\'' +
                '}';
    }



}
