import java.util.Scanner;

public class MainW4_4 {
    public static void main(String[] args) {

        Scanner input= new Scanner (System.in);
        int [] numbers = new int [5]; //array for 5

        for (int i = 0; i< numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers [i] = input.nextInt(); // this is so that the user can input numbers into the array
        }


        int highest = numbers [0];
        int lowest = numbers[0]; //assuming the first value is highest and lowest  
        for (int i = 0; i < numbers.length; i++) {
            if (numbers [i] > highest) {
                highest = numbers [i];
            }

            if (numbers [i] < lowest) {
                lowest = numbers [i];
            }

        } 
        System.out.println("highest number is: " +highest);
        System.out.println("lowest number is: " +lowest);

        input.close();
    }
}