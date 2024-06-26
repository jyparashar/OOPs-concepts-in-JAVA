package Collections_18;

import java.util.*;

public class LinkedHashSet3 {
    public static void main(String[] args) {
        // Creating a LinkedHashSet of String type with initial capacity of 20 and fill ratio of 0.75
        LinkedHashSet<String> lhs = new LinkedHashSet<String>(20, 0.75f);

        // Adding elements to the LinkedHashSet
        lhs.add("Apple");
        lhs.add("Banana");
        lhs.add("Cherry");

        System.out.println("LinkedHashSet with specified size and fill ratio: " + lhs);
    }
}