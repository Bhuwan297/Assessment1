
/**
 * Write a description of class StudentMarks here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;


public class StudentMarks
{
 
    public static void main(String[] args ) {
        
        //defining the number of students 
        int numberOfStudents = 30;
        
        //creating array to store the marks
        float[] marks = new float[numberOfStudents];
        Scanner scanner = new Scanner(System.in);
        
        // promt for users to enter the marks 
         System.out.println("Enter the marks of all students: ");
         
         
         for (int i = 0; i< numberOfStudents; i++){
             //let's create a program to check the validity of the marks given.
             
             float checkMarks = scanner.nextFloat();
             if (checkMarks <=0 || checkMarks > 30){
                System.out.println("Invalid marks, Please enter the valid marks");
            }
            marks[i]= checkMarks;
             
            };
            
         System.out.println("Entered Marks: ");
         for (int j = 0; j<numberOfStudents; j++ ){
          System.out.println(marks[j]);
        }
        
        //let's create a code for mean first and go for the 
        // highest and lowest later.
        //mean = sum of all marks /number of marks
        
        float totalMarks = 0;
        
        for (int i=0; i<numberOfStudents; i++){
            totalMarks = totalMarks + marks[i];
            
        }
        
        float mean = totalMarks / numberOfStudents;
         
         
         
        
    }
    
}
