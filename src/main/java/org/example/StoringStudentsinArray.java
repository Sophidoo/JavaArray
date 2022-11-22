package org.example;

import java.util.Scanner;

public class StoringStudentsinArray {
    public void StudentDetails(){
//        An array that stores the students name department and score
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter the number of students you wish to store");
        int rows = input.nextInt();
        int column = 3;

        String students[][] = new String[rows][column];

        System.out.println("\nPlease enter student's details in the order: Students_name Department Score");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < column; j++){
                students[i][j] = input.next();
            }
        }

        System.out.println("\nThe Stored student's details are: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < column; j++){
                System.out.print(students[i][j] + ", ");
            }
            System.out.println();
        }

    }
}
