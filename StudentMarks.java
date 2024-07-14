
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
        
         System.out.println("Enter the marks of students: ");
         
         for (int i = 0; i> numberOfStudents; i++){
            marks[i]= scanner.nextFloat();
            
            
            };
         
         
        
    }
    
}
