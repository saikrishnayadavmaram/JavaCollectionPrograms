package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetSample {
    public static void main(String[] args) {

        TreeSet<Integer> evenNumbers = new TreeSet<>();

        // Using the add() method
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        System.out.println("TreeSet: " + evenNumbers);

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);

        // Using the addAll() method
        numbers.addAll(evenNumbers);
        System.out.println("New TreeSet: " + numbers);

        //Access TreeSet Elements

        // Calling iterator() method
        Iterator<Integer> iterate = numbers.iterator();
        System.out.print("TreeSet using Iterator: ");
        // Accessing elements
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");

            //Methods for Navigation
            // Using the first() method
            int first = numbers.first();
            System.out.println("First Number: " + first);

            // Using the last() method
            int last = numbers.last();
            System.out.println("Last Number: " + last);
        }
    }
}