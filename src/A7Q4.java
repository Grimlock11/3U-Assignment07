import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ayyaf3300
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // input a new scanner
        Scanner input = new Scanner(System.in);
        // create an array that involves the students marks
        int[] marks = new int[10];
        // tell the user to input 10 marks
        System.out.println("Please enter 10 student marks.");
        // create a for loop that will go throught the array 
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }
        // this for loop goes through the numbers 
        // the for loop goes through all 10 marks moving up a space each time a
        // character in the array each time to rearange in smallest to largest order 
        for (int i = 0; i < 10; i++) {
            for (int f = 0; f < 10; f++) {
                int x = marks[i];
                int y = marks[f];
                // sort the numbers from smallest to largest
                if (marks[i] < marks[f]) {
                    marks[i] = y;
                    marks[f] = x;
                }
            }
        }
        // ouput all 10 marks fro smallest to largest using a for loop
        System.out.println("The student marks from lowest to hightest are: ");
        // a for loop is used to output the marks in order from smallest to largest)
        for (int i = 0; i < 10; i++) {
            System.out.println(marks[i]);
        }
    }
}