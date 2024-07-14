
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
        
        int numberOfStudents = 30;
        float[] marks = new float[numberOfStudents];
        Scanner scanner = new Scanner(System.in);
        
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
         
         
         
        
    }
    
}
