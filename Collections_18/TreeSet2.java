package Collections_18;

import java.util.*;

public class TreeSet2 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add("Dog");
        treeSet.add("Cat");
        treeSet.add("Elephant");
        treeSet.add("Dog"); // Duplicate, will not be added

        // Printing the TreeSet
        System.out.println("TreeSet: " + treeSet);
    }
}
