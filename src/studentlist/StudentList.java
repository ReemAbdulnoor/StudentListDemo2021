/*
 *  Reem Abdulnoor
 *  Student ID:991614933
 *  Web design 
 */
package studentlist;

import java.util.Scanner;

/**
 *
 * @author RA
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student[] students = new Student[2];
        Scanner input = new Scanner(System.in);
        
        for (int i=0; i<students.length; i++){
            System.out.println("enter the studetn's name");
            String name = input.nextLine();
            Student student = new Student(name);
            
            students[i]= student;
            
            
        }
        System.out.println("printing the  studetns:");
        String format= "the student's name is %S\n";
        for (Student student: students)
            System.out.printf(format, student.getName());
        
    }
    
}
