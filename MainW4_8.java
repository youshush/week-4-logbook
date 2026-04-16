import java.util.ArrayList;
import java.util.Scanner;

public class MainW4_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>(); //creating an arraylist to store the numbers

        for (int i = 0; i < 5; i++ ) { // inputing the 5 numbers 
            System.out.print("Enter a number: ");
            numbers.add(input.nextInt()); //adding the input numbers to the arraylist
        }

        // outputing it
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println (numbers.get(i)); //getting the numbers from the array list and outputing them 
        }

        input.close();
    }
}