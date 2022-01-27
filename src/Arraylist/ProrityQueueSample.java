package Arraylist;

import java.util.Iterator;
import java.util.PriorityQueue;

public class ProrityQueueSample {
    public static void main(String[]args){
        // Creating a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // Using the add() method
        numbers.add(4);
        numbers.add(2);
        System.out.println("PriorityQueue: " + numbers);

        // Using the offer() method
        numbers.offer(1);
        System.out.println("Updated PriorityQueue: " + numbers);


        // Using the peek() method
        int number = numbers.peek();
        System.out.println("Accessed Element: " + number);

        // Using the remove() method
        boolean result = numbers.remove(2);
        System.out.println("Is the element 2 removed? " + result);

        // Using the poll() method
        int numberr = numbers.poll();
        System.out.println("Removed Element Using poll(): " + numberr);

        //Using the iterator() method
        Iterator<Integer> iterate = numbers.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}
