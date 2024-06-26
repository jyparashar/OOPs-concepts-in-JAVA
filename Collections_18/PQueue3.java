package Collections_18;

import java.util.*;
public class PQueue3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 15);
        PriorityQueue<Integer> pq = new PriorityQueue<>(numbers);

        // Display the elements in the PriorityQueue
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
