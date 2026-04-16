import java.util.Scanner;

public class MainW4_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int [] number = new int [5]; //declare variable array

        //for loop to input number
        for (int i = 0; i < number.length; i++) {
            System.out.print("Enter a number: ");
            number [i] = input.nextInt();
        }

        int count = 0; // counts even numbers stored in the array

        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) { // if remainder is 0 so even 
                count++; // add 1 to the counter
            }
        }
        System.out.println("the number of even numbers are: " + count);

        input.close();
    }
}