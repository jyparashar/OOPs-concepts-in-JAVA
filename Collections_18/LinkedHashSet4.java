package Collections_18;

import java.util.*;

public class LinkedHashSet4 {
    public static void main(String[] args) {
        // Creating a List of Double type
        List<Double> numberList = new ArrayList<>();
        numberList.add(3.14);
        numberList.add(2.71);
        numberList.add(1.41);

        // Creating a LinkedHashSet from the List
        LinkedHashSet<Double> lhs = new LinkedHashSet<Double>(numberList);

        System.out.println("LinkedHashSet created from Collection: " + lhs);
    }
}
