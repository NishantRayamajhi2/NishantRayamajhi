import java.util.Scanner;

/**
 * Write a description of class StudentMark here.
 *
 * @Nishant Rayamajhi
 * @version (a version number or a date)
 */
public class StudentMark {
    public static void main(String[] args) {
        int numberOfStudents = 30;
        float[] marks = new float[numberOfStudents];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give marks for 30 students");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter mark for student " + (i + 1) + ": ");
            marks[i] = scanner.nextFloat();
        }
        float total=0;
        for (int i = 0; i < numberOfStudents; i++) {
        total=total + marks[i];
        }  
        System.out.println("Entered marks:");
        for (float mark : marks) {
            System.out.println(mark);
        }
        float mean =0;
        mean=total/numberOfStudents;
            System.out.printIn(mean);
            
    }
}
