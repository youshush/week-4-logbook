import java.util.ArrayList;

public class MainW4_9 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(); // to make an array list called numbers

        //add numbers to the array list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
       
        System.out.println ("the list of numbers are: "+ numbers);

        //remove a number
        numbers.remove(4); // removes from index the 4th one

        System.out.println ("After removing the number : " + numbers);
        


    }
}