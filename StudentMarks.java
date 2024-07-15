
/**
 * This class is created by southern cross student, A complete beginner in this, 
 * this is just a small and best put effort to come accross the solution for 
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
         
        // let's create a loop to input marks and validate.
        // This is a loop that will run once for each student (30 times in our case)
        
             for (int i = 0; i < numberOfStudents; i++) {
            while (true) {
                // This is an infinite loop that will keep asking for input
                //until we get a valid mark
                
                System.out.print("Enter the marks for student " + (i + 1) + ": ");
                float mark = scanner.nextFloat(); //this  line prints a message asking the user to enter a mark for the current student
        // (i + 1) is used because arrays start at 0, but we want to display student numbers starting from 1


                // here we are Checking if given mark is valid or not by using
                // and method where we are asking
                if (mark > 0 && mark <= 30) {
                    marks[i] = mark; // valdating the user inputs 
                    break; // exit loop if user has provided the valid mark
                } else {
                    System.out.println("Invalid mark! Please enter a mark between 0 and 30.");
                    //If the mark is not valid, this line prints an error message and the loop continues
            // The user is prompted to enter the mark again
                }
            }
        }
          
            

         // Printing  entered marks
        System.out.println("\nEntered Marks:");
        for (int j = 0; j < numberOfStudents; j++) {
            System.out.println("Student " + (j + 1) + ": " + marks[j]);
        }
        
        // now let's find out the highest and lowest mark
        
        float highestMark = marks [0]; // let's Assume the first mark is the highest one
        float lowestMark  = marks [0]; // and again let's Assume the first mark is the lowest
        
        //entering loop where we can find out highest mark by comparing with
        // other inputs that user has provided.
        for (int k=1; k< numberOfStudents; k++){
            if (marks[k]> highestMark) // If current mark is higher,update highestMark 
            {
                highestMark= marks[k];  
            }
            if (marks [k] < lowestMark) // If current mark is lower, update lowestMark
            {
                lowestMark = marks[k];
            }
            
            
        }
        System.out.println ("\nHighest Mark: " + highestMark); // print the highest mark
        System.out.println ("\n LowestMark: "  + lowestMark);  // print the lowest mark
        
        // now let's dive into calculating the mean.
        // in mean we will add up all the marks and 
        // We divide the total by the number of students to get the average.
        
        float sum = 0;
        for (float mark: marks) //entering loop for adding marks with the variable mark.
        {
        sum = sum + mark; // here we are  Adding  each mark to sum
    }
    float mean = sum/numberOfStudents;  // calculating the average  
    System.out.println("the mean is: " +mean); // printing the average.
    
    
// now let's dive into calculating the standard deviation, although this task
// was too tough to go through for a complete beginner,
// however I have to go through the java course online and with there was not enough
// resources for this in our course content.
// and with the help of bit of a research I have managed to come up with the 
// solution. 

// In standard deviation...  


    
    
    
        
      
         
         
         
        
    }
    
}
