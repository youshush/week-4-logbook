import java.util.Scanner;

public class MainW4_2 {
    public static void main (String[] aSrgs) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5]; // creates an empty array of 5
// input loop
        for (int i = 0; i < numbers.length; i++) {  // for loop where it starts from the begining and goes in incremets of 1
            System.out.println(" Enter a number: "); // user enters a number
            numbers [i] = input.nextInt(); // stores the inputs in the array
        }

        //output loop
        for (int i = 0; i < numbers.length; i++){
            System.out.println (numbers[i]); // prints the numbers in the array
        }

        input.close();


    }
}

