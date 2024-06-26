package Collections_18;

//initialising ArrayList using add keyword
import java.util.*;
public class ArrayList1 {
    public static void main(String args[])
    {
        // create an ArrayList of String type
        ArrayList<String> str = new ArrayList<String>();

        // Initialize an ArrayList with add()
        str.add("Itechnica");
        str.add("Topics");
        str.add("Rocks");
        str.add(1,"Java");

        // to print the ArrayList
        System.out.println("ArrayList is" + str);
    }
}
