package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
    public static void main(String[] args) {

        //Adding of elements

        ArrayList ar = new ArrayList();
        ar.add("Sai");
        ar.add("krishna");
        ar.add("Yadav");
        ar.add("Maram");
        ar.add("Java");
        ar.add("Dev");

        //displaying of elements
        System.out.println("ARRAYLIST:");

        //Adding of element to the index

        ar.add(4, "Kmc");

        //Updated Arraylist

        System.out.println(ar);

        //Removing of an element

        System.out.println(ar.remove(2));
        System.out.println(ar);

        // System.out.println(ar.contains("kmc"));

        System.out.println(ar.remove("kmc"));
        System.out.println(ar);

        //Displaying Array Size
        System.out.println(ar.size());

        //Set
        System.out.println(ar.set(1, "Corp"));
        System.out.println(ar);

        Iterator iterator = ar.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());


    }
}
