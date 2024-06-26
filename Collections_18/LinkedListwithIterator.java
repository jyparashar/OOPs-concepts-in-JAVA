package Collections_18;

import java.util.*;

public class LinkedListwithIterator {
    public static void main(String[] args) {
        // Create a LinkedList and add some elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("JavaScript");
        linkedList.add("C++");

        // Obtain an Iterator from the LinkedList
        Iterator<String> iterator = linkedList.iterator();

        // Use the Iterator to traverse and display elements
        System.out.println("Displaying elements:");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Obtain a new Iterator for removal
        iterator = linkedList.iterator();

        // Use the Iterator to remove elements
        System.out.println("\nRemoving elements:");
        while (iterator.hasNext()) {
            String element = iterator.next();
            iterator.remove();
            System.out.println("Removed: " + element);
        }

        // Display the LinkedList after removal
        System.out.println("\nLinkedList after removal: " + linkedList);
    }
}