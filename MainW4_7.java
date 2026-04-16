import java.util.Scanner;

public class MainW4_7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] number = new int[5];


        //scanner input for user

        for (int i = 0; i < number.length; i++) {
            System.out.print("enter a number: ");
            number[i] = input.nextInt();
        }

        int count = 0; //starts at 0

        //check if count number greater than 10
        for (int i= 0; i< number.length; i++) {
            if (number[i] > 10) { // if number is greater than 10
                count++; // add 1 to the counter
            }
        }
        System.out.println("the number of numbers that were greater than 10 are: " + count);

        input.close();
    }
}