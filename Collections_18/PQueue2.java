package Collections_18;

import java.util.*;
public class PQueue2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(10);

        // Add elements to the PriorityQueue
        pq.add(10);
        pq.add(20);
        pq.add(15);

        // Display the elements in the PriorityQueue
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}