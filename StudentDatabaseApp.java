package student.database.app;

import java.util.Scanner;

//The main class

public class StudentDatabaseApp {
    public static void main (String[] args) {
        //To create a new student 
        //Student student1 = new Student();
        //student1.enroll();
        //student1.payTuition();
        //System.out.println(student1.toString());
        
       //Ask how many new students we want to add 
       System.out.println("Enter number of new students to enroll: ");
       Scanner in = new Scanner(System.in);
       int numOfStudents = in.nextInt();
       Student[] students = new Student[numOfStudents];
       
       //Create n number of new students
       for (int n = 0; n < numOfStudents; n++) {
           students[n] = new Student();
           students[n].enroll();
           students[n].payTuition();
           System.out.println(students[n].toString());
       } 
    }
}