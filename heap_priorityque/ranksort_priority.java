
// In this code the rank to sort the name of the student and also student have highest rank this student hav in first 
package heap_priorityque;

import java.util.PriorityQueue;

public class ranksort_priority {
    static class Student implements Comparable<Student> {// overriding
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq =new PriorityQueue<>();
        //PriorityQueue<Student> pq =new PriorityQueue<>(Comparator.reverseOrder());// reverse print 

        pq.add(new Student("A",14 ));
        pq.add(new Student("B",2));
        pq.add(new Student("C",10));
        pq.add(new Student("D",1));
        pq.add(new Student("E",15 ));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }

    }
}
