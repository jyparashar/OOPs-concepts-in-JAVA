package Collections_18;

// initialise ArrayList using asList method
import java.util.*;
public class ArrayList2 {
    public static void main(String args[])
    {
        // create an ArrayList of String type
        // and Initialize an ArrayList with asList()
        ArrayList<String> str = new ArrayList<String>(
                Arrays.asList("I", "love", "Java")
        );

        str.add(0,"Programming");
        // to print the ArrayList
        System.out.println("ArrayList is " + str.size() + " "+str);
    }
}