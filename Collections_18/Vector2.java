package Collections_18;

import java.util.*;
public class Vector2 {
    public static void main(String args[]) {
        //creating a Vector
        Vector<Integer> v = new Vector<Integer>(5,2);

        //displaying the size
        System.out.println("Size at the beginning " + v.size());

        //add elements
        v.add(19);
        v.add(88);
        v.add(1);
        v.add(39);
        v.add(23);
        v.add(23);
        v.addFirst(50);

        //displaying the Vector
        System.out.println(v);

        //displaying the size
        System.out.println("Size after addition " + v.size());

        //remove element at index 3
        v.remove(3);

        //display the new Vector
        System.out.println("After removing 3rd index item "+ v);

        //display the new size
        System.out.println("Size after removal " + v.size());

        // Print the Vector
        System.out.println("Vector elements:");
        for (Integer element : v) {
            System.out.println(element);
        }
    }
}
