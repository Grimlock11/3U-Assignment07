import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ayyaf3300
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // input a new scanner
        Scanner input = new Scanner(System.in);
        // create a variable
        double total = 0;
        // ask the user to input the number of people that are in the group
        System.out.println("How many people are in the group? ");
        // save the number in the variable numberofpeople
        int numberofpeople = input.nextInt();
        // make an array using the number of people that are in the group
        int[] heights = new int[numberofpeople];
        // tell the user to enter the heights of all the members in the group in centimeters
        System.out.println("Enter the heights of all members in centimeters ");
        // gaet a for loop that will go through the array
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextInt();
            total = total + heights[i];
        }

        // get the average height
        double avg = Math.round((total / heights.length) * 100) / 100;
        // tell the user the height average
        System.out.println("The average height of this group is " + avg + "cm");
        // output the people's height's that are above the average
        System.out.println("If you have the following number you are above the height average");
        // find out the average using a loop through the array
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > avg) {
                // output the numbers of which height average is above the total average
                System.out.println(heights[i]);
            }
        }
    }
}