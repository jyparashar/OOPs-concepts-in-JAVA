package Collections_18;

// initialise ArrayList using List.of() method
import java.util.*;
public class ArrayList3 {
    public static void main(String[] args) {
        // create an ArrayList of String type
        // and Initialize an ArrayList with List.of()
        List<String> str;

        str = new ArrayList<String>(
                List.of("Coding", "is", "Fun")
        );

        str.add("and");
        str.add("Java");

        // to print the ArrayList
        System.out.println("ArrayList is " + str);

        str.clear();

        System.out.println("ArrayList is " + str);

        System.out.println(str.contains("Java"));


    }
}