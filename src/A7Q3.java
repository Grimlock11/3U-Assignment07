import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ayyaf3300
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // input a new scanner
        Scanner input = new Scanner(System.in);
        // create an array with the variable A that contains two elements
        int[] A = new int[2];
        // tell the user ti input two whole numbers
        System.out.println("Enter two whole numbers");
        // create a loop that will go throught the whole array
        for (int i = 0; i < 2; i++) {
            A[i] = input.nextInt();
        }
        // check the the numbers to see if one is larger than the other
        if (A[1] > A[0]) {
            // If true, the numbers have been outputed in smallest to largest
            // the program will output space zero then space one
            System.out.println("The integers in smallest to largest are " + A[0] + ", " + A[1] + ".");
        } else {
            // if is not true, the program will output the second digit first and then the first digit  
            System.out.println("The integers in smallest to largest are " + A[1] + ", " + A[0] + ".");
        }
    }
}