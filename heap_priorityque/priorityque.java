

package heap_priorityque;
import java.util.*;
import java.util.PriorityQueue;
public class priorityque {
public static void main(String[] args) {
    PriorityQueue<Integer> pq =new PriorityQueue<>(Comparator.reverseOrder());

    pq.add(3);
    pq.add(4);
    pq.add(1);
    pq.add(7);

    while(!pq.isEmpty()){
        System.out.println(pq.peek());
        pq.remove();//o(log n)
    }
}
}
