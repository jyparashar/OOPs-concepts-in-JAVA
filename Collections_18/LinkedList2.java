package Collections_18;

import java.util.*;
public class LinkedList2 {
    public static void main(String[] args) {
        // Create a collection (ArrayList) with some elements
        Collection<String> collection = new ArrayList<>();
        collection.add("Element1");
        collection.add("Element2");
        collection.add("Element3");
        collection.add("Element4");

        // Create a LinkedList from the collection
        LinkedList<String> l1 = new LinkedList<String>(collection);

        //Display linkedlist
        System.out.println(l1);

        // Print the LinkedList
        System.out.println("LinkedList elements:");
        for (String element : l1) {
            System.out.println(element);
        }
    }
}

