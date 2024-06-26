package Collections_18;

import java.util.*;

public class TreeSet3 {
    public static void main(String[] args) {
        // Instantiate a SortedSet
        SortedSet<Integer> sortedSet = new TreeSet<>();

        // 1. add(E e) - Adds the specified element to the set
        sortedSet.add(5);
        sortedSet.add(2);
        sortedSet.add(8);
        sortedSet.add(1);
        System.out.println("Set after adding elements: " + sortedSet);

        // 2. remove(Object o) - Removes the specified element from the set
        sortedSet.remove(2);
        System.out.println("Set after removing 2: " + sortedSet);

        // 3. first() - Returns the first (lowest) element
        System.out.println("First element: " + sortedSet.first());

        // 4. last() - Returns the last (highest) element
        System.out.println("Last element: " + sortedSet.last());

        // 5. headSet(E toElement) - Returns a view of the portion of the set strictly less than toElement
        SortedSet<Integer> headSet = sortedSet.headSet(5);
        System.out.println("HeadSet (elements < 5): " + headSet);

        // 6. tailSet(E fromElement) - Returns a view of the portion of the set greater than or equal to fromElement
        SortedSet<Integer> tailSet = sortedSet.tailSet(5);
        System.out.println("TailSet (elements >= 5): " + tailSet);

        // 7. subSet(E fromElement, E toElement) - Returns a view of the portion of the set between fromElement (inclusive) and toElement (exclusive)
        SortedSet<Integer> subSet = sortedSet.subSet(3, 8);
        System.out.println("SubSet (3 <= elements < 8): " + subSet);

        // 8. size() - Returns the number of elements in the set
        System.out.println("Size of the set: " + sortedSet.size());

        // 9. isEmpty() - Returns true if the set contains no elements
        System.out.println("Is the set empty? " + sortedSet.isEmpty());

        // 10. contains(Object o) - Returns true if the set contains the specified element
        System.out.println("Does the set contain 5? " + sortedSet.contains(5));

        // 11. clear() - Removes all elements from the set
        sortedSet.clear();
        System.out.println("Set after clearing: " + sortedSet);
    }
}