import java.util.Scanner;

/**
 * Write a description of class StudentMark here.
 *
 * @Nishant Rayamajhi
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.ArrayList;

public class StudentMark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input assignment name
        System.out.print("Enter the assignment name: ");
        String assignmentName = input.nextLine();
        
        ArrayList<Double> marks = new ArrayList<>();
        int numStudents = 30;
        
        // Collect marks for 30 students
        for (int i = 0; i < numStudents; i++) {
            while (true) {
                System.out.print("Enter mark for student " + (i + 1) + " (0-30): ");
                double mark = input.nextDouble();
                if (mark >= 0 && mark <= 30) {
                    marks.add(mark);
                    break;
                } else {
                    System.out.println("Error: Mark must be between 0 and 30. Please re-enter.");
                }
            }
        }
        
        // Display assignment name and marks
        System.out.println("\nAssignment: " + assignmentName);
        System.out.println("Marks: " + marks);
        
        // Algorithm 1: Find highest and lowest mark
        double highestMark = marks.get(0);
        double lowestMark = marks.get(0);
        for (double mark : marks) {
            if (mark > highestMark) {
                highestMark = mark;
            }
            if (mark < lowestMark) {
                lowestMark = mark;
            }
        }
        System.out.println("\nThe highest mark is: " + highestMark);
        System.out.println("The lowest mark is: " + lowestMark);
        
        // Algorithm 2: Calculate mean and standard deviation
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        double mean = total / marks.size();
        
        double sumOfSquares = 0;
        for (double mark : marks) {
            sumOfSquares += Math.pow(mark - mean, 2);
        }
        double standardDeviation = Math.sqrt(sumOfSquares / marks.size());
        
        System.out.println("The mean is: " + mean);
        System.out.println("The standard deviation is: " + standardDeviation);
        
        input.close();
    }
}


