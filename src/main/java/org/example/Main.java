package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StoringStudentsinArray stud = new StoringStudentsinArray();
//        stud.StudentDetails();

        StudentInterface studentsDetails = new StudentInterface();

        List<StudentModel> students = Arrays.asList(
                new StudentModel(1, "Sophia", "Okosodo", "Computer Science", "Science", "Female", "U2020/046", "rivers", 100 ),
                new StudentModel(2, "Henry", "Chukwudi", "Computer Science", "Science", "Male", "U2020/045", "rivers", 200 ),
                new StudentModel(3,"Margi","Zukerman","Pharmacy","Pharmaceutical Science","Female","U2018/069","lagos", 500),
                new StudentModel(4,"Cassy","Sheahan","Human Resources","Engineering","Female","U2015/077","Bayelsa", 300),
                new StudentModel(5,"Earl","Kleinmintz","Product Management","Business Development","Male","U2020/060","Uyo", 400),
                new StudentModel(6,"Alisander","Casson","Law","Law","Male","U2019/050","Lagos", 200),
                new StudentModel(7,"Joye","Airy","Mechanical","Engineering","Male","U2021/120","rivers", 100),
                new StudentModel(8, "Mary", "George", "Computer Science", "Science","Female", "U2021/030", "lagos", 300),
                new StudentModel(9, "Alexander", "Mark", "Anatomy", "Basic Meidicals", "Male", "U2015/130", "bayelsa", 400),
                new StudentModel(10, "Fortune", "Ken Osuh", "Geology", "Science", "Male", "U2020/91", "rivers", 100),
                new StudentModel(11, "Promise", "Atanu", "Nursing", "Meidical", "Female", "U2019010", "edo", 200),
                new StudentModel(12, "Jennifer", "Okosodo", "Civil Engineering", "Engineering", "Female", "U2021/084", "Benin", 300),
                new StudentModel(13, "Pearl", "Drake", "Sociology", "Social SCience", "Male", "U2020/220", "delta", 300),
                new StudentModel(14, "Happiness", "Okpara", "Sociology", "Social Science", "Female", "U2019/123", "rivers", 200),
                new StudentModel(15, "Margaret", "Okosodo", "Business Administration", "Business", "female", "U2018/022", "Edo", 400),
                new StudentModel(16, "Vincent", "Osazebhen", "Economics", "Social Science", "Male", "U2019/032", "Uromi", 300),
                new StudentModel(17, "Sandra", "Olumese", "Physiology", "Medicals", "Female", "U2020/42", "Ewohimi", 200),
                new StudentModel(18, "Kecia", "Obinda", "Mechatronics", "Engineering", "Female", "U2020/423", "Rivers", 300),
                new StudentModel(19, "GLory", "Okoro", "Biochemistry", "Science", "Female", "U2020/32", "Imo", 100),
                new StudentModel(20, "Leveticus", "Dominion", "History", "Humanities", "Male", "U2018/043", "Niger", 200)
        );

        studentsDetails.displayByLastname(students, "Okosodo");



    }
}