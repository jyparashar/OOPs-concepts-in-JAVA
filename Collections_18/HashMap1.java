package Collections_18;

import java.util.*;

public class HashMap1 {
    public static void main(String[] args) {
        // Instantiating a Map using HashMap
        Map<Integer, String> hm = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hm.put(1, "Apple");
        hm.put(2, "Banana");
        hm.put(3, "Cherry");

        // Displaying the HashMap
        System.out.println("HashMap: " + hm);

        // Accessing values using keys
        String value1 = hm.get(1);
        System.out.println("Value for key 1: " + value1);

        // Checking if a key exists
        boolean keyExists = hm.containsKey(2);
        System.out.println("Key 2 exists: " + keyExists);

        // Checking if a value exists
        boolean valueExists = hm.containsValue("Banana");
        System.out.println("Value 'Banana' exists: " + valueExists);

        // Removing a key-value pair
        hm.remove(3);
        System.out.println("HashMap after removing key 3: " + hm);

        // Iterating over the HashMap
        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
