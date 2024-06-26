package Collections_18;

import java.util.*;
public class Vector3 {
    public static void main(String[] args) {
        // Create a collection (ArrayList) with some elements
        Collection<String> collection = new ArrayList<>();
        collection.add("Hello");
        collection.add("World");
        collection.add("Hi");
        collection.add("Bonjour");

        // Create a Vector from the collection
        Vector<String> v = new Vector<>(collection);

        //Display Vector
        System.out.println(v);

        // Print the Vector
        System.out.println("Vector elements:");
        for (String element : v) {
            System.out.println(element);
        }
    }
}