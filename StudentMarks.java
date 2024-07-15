
/**
 * This class is created by southern cross student, A complete beginner in this 
 * this is just a small and best put effor to come accross the solution for 
 * the given task, where we will be:
 * 
 * 1. getting marks of students from user
 * 2. printing the marks 
 * 3. calculating the highest and lowest mark entered 
 * 3. trying to calculate the mean
 * 4. although it might not be perfect, being a complete beginner, I have 
 * tried put my best effort for calculating the standard deviation as well. 
 * 
 *
 * @author Bhuwan Kandel
 * @version 15th july 2024
 */

import java.util.Scanner;


public class StudentMarks
{
 
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the assignment name: "); // here we are asking for the assignment 
        String assignmentName = scanner.nextLine();      // name from the user to make it more realistic to the real world.
        
        
        
        //here we are defining the number of students 
        int numberOfStudents = 30;
        
        //creating array to store the marks of students.
        float[] marks = new float[numberOfStudents];
        
        // this is the promt for users to enter the marks  
         System.out.println("Enter the marks of all students: ");
         
        // let's create loop to input marks and validate.
        
             for (int i = 0; i < numberOfStudents; i++) {
            while (true) {
                // this is the Prompt for mark
                System.out.print("Enter the marks for student " + (i + 1) + ": ");
                float mark = scanner.nextFloat();

                // here we are Checking if given mark is valid or not by using
                // and method where we are asking
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
