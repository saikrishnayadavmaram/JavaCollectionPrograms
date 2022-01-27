package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedL {
    public static void main(String args[]) {

        LinkedList LinkedL = new LinkedList();

        //Adding elements to the Linked list
        LinkedL.add("Sai");
        LinkedL.add("Krishna");
        LinkedL.add("Yadav");

        //Adding an element to the first position
        LinkedL.addFirst("Java");

        //Adding an element to the last position
        LinkedL.addLast("kafka");

        //Adding an element to the 3rd position
        LinkedL.add(2, "Kmc");

        //Removing the element
        LinkedL.remove(3);


        //Iterating LinkedList
        Iterator<String> iterator = LinkedL.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
