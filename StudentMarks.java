
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
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the assignment name: ");
        String assignmentName = scanner.nextLine();
        
        
        
        //defining the number of students 
        int numberOfStudents = 30;
        
        //creating array to store the marks
        float[] marks = new float[numberOfStudents];
        
        // promt for users to enter the marks 
         System.out.println("Enter the marks of all students: ");
         
         
            
             for (int i = 0; i < numberOfStudents; i++) {
            while (true) {
                // Prompt for mark
                System.out.print("Enter the marks for student " + (i + 1) + ": ");
                float mark = scanner.nextFloat();

                // Checking if mark is valid
                if (mark > 0 && mark <= 30) {
                    marks[i] = mark; // valdating the user inputs 
                    break; // exit loop if user has provided the valid mark
                } else {
                    System.out.println("Invalid mark! Please enter a mark between 0 and 30.");
                }
            }
        }
          
            

         // Printing  entered marks
        System.out.println("\nEntered Marks:");
        for (int j = 0; j < numberOfStudents; j++) {
            System.out.println("Student " + (j + 1) + ": " + marks[j]);
        }
        
        // now let's find out the highest and lowest mark
        
        float highestMark = marks [0];
        float lowestMark  = marks [0];
        
        //entering loop where we can find out highest mark by comparing with
        // other inputs tha user has provided.
        for (int k=1; k< numberOfStudents; k++){
            if (marks[k]> highestMark) {
                highestMark= marks[k];
            }
            if (marks [k] < lowestMark){
                lowestMark = marks[k];
            }
            
            
        }
        System.out.println ("\nHighest Mark: " + highestMark);
        System.out.println ("\n LowestMark: "  + lowestMark);
        
        //calcuating the mean 
        
        float sum = 0;
        for (float mark: marks) //entering loop for adding marks with the variable mark.
        {
        sum = sum + mark;
    }
    float mean = sum/numberOfStudents;
    System.out.println("the mean is: " +mean);
    
    
        
      
         
         
         
        
    }
    
}
