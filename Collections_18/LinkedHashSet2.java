package Collections_18;

import java.util.*;

public class LinkedHashSet2 {
    public static void main(String[] args) {
        // Creating a LinkedHashSet of Integer type with initial capacity of 10
        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(10);

        // Adding elements to the LinkedHashSet
        lhs.add(5);
        lhs.add(10);
        lhs.add(15);

        System.out.println("LinkedHashSet with specified size: " + lhs);
    }
}