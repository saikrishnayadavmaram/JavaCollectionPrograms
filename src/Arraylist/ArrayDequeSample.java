package Arraylist;
import java.util.ArrayDeque;

class ArrayDequeSample {
    public static void main(String[] args) {
        ArrayDeque<String> animals= new ArrayDeque<>();

        //Add elements using add(), addFirst() and addLast()

        // Using add()
        animals.add("Dog");

        // Using addFirst()
        animals.addFirst("Cat");

        // Using addLast()
        animals.addLast("Horse");
        System.out.println("ArrayDeque: " + animals);

       // Access elements using peek(), peekFirst() and peekLast() method

        // Using peek()
        String element = animals.peek();
        System.out.println("Head Element: " + element);

        // Using peekFirst()
        String firstElementt = animals.peekFirst();
        System.out.println("First Element: " + firstElementt);

        // Using peekLast
        String lastElementt = animals.peekLast();
        System.out.println("Last Element: " + lastElementt);

       // Remove elements using the poll(), pollFirst() and pollLast() method ()

        // Using poll()
        String elementt = animals.poll();
        System.out.println("Removed Element: " + elementt);
        System.out.println("New ArrayDeque: " + animals);

        // Using pollFirst()
        String firstElement = animals.pollFirst();
        System.out.println("Removed First Element: " + firstElement);

        // Using pollLast() method

        String lastElement = animals.pollLast();
        System.out.println("Removed Last Element: " + lastElement);

    }

}