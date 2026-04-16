import java.util.Scanner;

public class MainW4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int[] numbers = new int[5]; // array of 5 values
        int sum = 0; // variable main to store sum and it starts at 0


        for (int i =0; i < numbers.length; i++) { //for loop for input
            System.out.print("enter a number: ");
            numbers [i] = input.nextInt(); // users input

        }

        for (int i = 0; i < numbers.length; i++) { // (calculate sum)
            sum = sum + numbers[i]; //adds each number to sum variable 
        }

        // calculate average
        double average = (double) sum / numbers.length;

        System.out.println("sum " + sum);
        System.out.println("Average: " + average);


     
    }
}