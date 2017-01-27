
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ayyaf3300
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // input a new scanner
        Scanner input = new Scanner(System.in);
        // tell the user to input the number of student marks 
        System.out.println("How many student marks are thier in the class? ");
        // store the variable in numberofmarks
        int numberofmarks = input.nextInt();
        // create a new array with the number of marks
        double[] marks = new double[numberofmarks];
        // tell the user to input the marks of each person
        System.out.println("Please enter the student marks.");
        // create a for loop that will go through the array 
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }
        
        // get the for loop to arrange the marks from smallest to largest
        // the for loop goes through all of the marks moving up a space in 
        // the array each time to rearange from smallest to largest
        for (int i = 0; i < marks.length; i++) {
            for (int f = 0; f < marks.length; f++) {
                double x = marks[i];
                double y = marks[f];
                if (marks[i] < marks[f]) {
                    marks[i] = y;
                    marks[f] = x;
                }
            }
        }
        // output athe students marks from smallest to largest
        System.out.println("The marks from smallest to largest are ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        // tell the user the average of the class
        // prints the average if needed
        if (marks.length % 2 == 0) {
            // calculates the average with even amount of numbers
            int middle = marks.length / 2;
            int middle2 = middle - 1;
            double average = (marks[middle] + marks[middle2]) / 2;
            // tell the user the average
            System.out.println("The average of the marks are " + average);
        } else {
            // calculates the average with odd numbers
            int middle = marks.length / 2;
            double average = marks[middle];
            // tell the user the average
            System.out.println("The average of the marks are " + average);
        }
    }
}