import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ayyaf3300
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // input the scanner
        Scanner input = new Scanner(System.in);
        // create a variable for the number of marks
        double total = 0;
        // tell the user to input the number of students that are in the class
        System.out.println("How many students in the class?");
        // save the number in the variable studentNum
        int studentNum = input.nextInt();
        // use the variable and create an array for student number
        int[] marks = new int[studentNum];
        // tell the user to input the number of student's marks
        System.out.println("Enter the marks of the students.");
        // create a for loop that will go through the array
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
            total = total + marks[i];
        }
        // get the total average by dividing the total by the marks and round to the nearest hundreth decimal place
        double avg = Math.round((total / marks.length) * 100d) / 100d;
        // show the user the test result's
        System.out.println("The class average is " + avg + "%.");
    }
}