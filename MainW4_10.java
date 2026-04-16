import java.util.ArrayList;

public class MainW4_10 {

    public static void main (String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();// creating array list called numbers

        numbers.add(1423); // adding numbers to the arraylist
        numbers.add(2432);
        numbers.add(3234);
        numbers.add(4543);
        numbers.add(5345);

        for (int i = 0 ; i < numbers.size(); i++) { // loop to check if number is even

            if (numbers.get(i) % 2 == 0) { // if its even then print it out 
                System.out.println(numbers.get(i));
            }
        }
    }
}