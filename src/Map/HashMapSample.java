package Map;

import java.util.HashMap;

public class HashMapSample {
    public static void main(String[] args) {

        // create a hashmap
        HashMap<String, Integer> languages = new HashMap<>();

        // add elements to hashmap

        languages.put("Java", 8);
        languages.put("JavaScript", 1);
        languages.put("Python", 3);
        System.out.println("HashMap: " + languages);

        // Access HashMap Elements

        // get() method to get value
        String value = String.valueOf(languages.get(1));
        System.out.println("Value at index 1: " + value);

        // return set view of keys
        // using keySet()
        System.out.println("Keys: " + languages.keySet());

        // return set view of values
        // using values()
        System.out.println("Values: " + languages.values());

        // return set view of key/value pairs
        // using entrySet()
        System.out.println("Key/Value mappings: " + languages.entrySet());

        // remove element associated with key 2
        String value1 = String.valueOf(languages.remove(1));
        System.out.println("Removed value: " + value1);

        System.out.println("Updated HashMap: " + languages);


    }
}

