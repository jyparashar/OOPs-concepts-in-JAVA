package Collections_18;

import java.util.*;

public class SetvsSortedSet {
    public static void main(String[] args) {
        // Regular Set (HashSet)
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(2);
        set.add(8);
        set.add(1);
        System.out.println("HashSet: " + set);  // Order is not guaranteed

        // SortedSet (TreeSet)
        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(5);
        sortedSet.add(2);
        sortedSet.add(8);
        sortedSet.add(1);
        System.out.println("TreeSet: " + sortedSet);  // Always sorted

        // Using SortedSet-specific methods
        System.out.println("First element: " + sortedSet.first());
        System.out.println("Last element: " + sortedSet.last());
        System.out.println("HeadSet (<5): " + sortedSet.headSet(5));
        System.out.println("TailSet (>=5): " + sortedSet.tailSet(5));
    }
}