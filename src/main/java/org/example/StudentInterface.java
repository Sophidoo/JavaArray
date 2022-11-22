package org.example;

import java.util.List;
import java.util.stream.Stream;

public class StudentInterface {
    public void displayAll(List<StudentModel> students){
        students.stream()
                .forEach(student -> System.out.println(student));
    }

    //    Method to display all students in a particular level
    public void displayByLevel(List<StudentModel> students, int level){
         students.stream()
                .filter(student -> student.getLevel() == level)
                 .forEach(student -> System.out.println(student));
    }

    public void displayById(List<StudentModel> students, int id){
        StudentModel getUser = students.stream()
                .filter(student -> id == student.getId())
                .findAny()
                .orElse(null);

        System.out.println(getUser);
    }

    public void displayByFirstname(List<StudentModel> students, String fname){
        students.stream()
                .filter(student -> fname.equalsIgnoreCase(student.getFirstname()))
                .forEach(student -> System.out.println(student));
    }

    public void displayByLastname(List<StudentModel> students, String lname){
        students.stream()
                .filter(student -> lname.equalsIgnoreCase(student.getLastname()))
                .forEach(student -> System.out.println(student));
    }

    public void displayByDepartment(List<StudentModel> students, String dept){
        students.stream()
                .filter(student -> dept.equalsIgnoreCase(student.getDepartment()))
                .forEach(student -> System.out.println(student));
    }

    public void displayByFaculty(List<StudentModel> students, String faculty){
        students.stream()
                .filter(student -> faculty.equalsIgnoreCase(student.getFaculty()))
                .forEach(student -> System.out.println(student));
    }

    public void displayByGender(List<StudentModel> students, String gender){
        students.stream()
                .filter(student -> gender.equalsIgnoreCase(student.getGender()))
                .forEach(student -> System.out.println(student));
    }

    public void displayByMatricNo(List<StudentModel> students, String matric){
        StudentModel getUser = students.stream()
                .filter(student -> matric.equals(student.getMatricNo()))
                .findAny()
                .orElse(null);

        System.out.println(getUser);

    }

    public void displayByState(List<StudentModel> students, String state){
        students.stream()
                .filter(student -> state.equalsIgnoreCase(student.getState()))
                .forEach(student -> System.out.println(student));
    }
}

