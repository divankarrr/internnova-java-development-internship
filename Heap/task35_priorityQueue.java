import java.util.Comparator;
import java.util.PriorityQueue;

public class task35_priorityQueue{
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override 
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
    }
    public static void main(String args[]){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        // insertion O(log n)
        pq.add(3);
        pq.add(4);
        pq.add(5);
        pq.add(1);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());//O(1)
            pq.remove();//O(log n)

        }
        PriorityQueue<Student> p=new PriorityQueue<>();
        p.add(new Student("A",5));
        p.add(new Student("B",4));
        p.add(new Student("C",1));
        p.add(new Student("D",6));
        p.add(new Student("E",2));
        while(!p.isEmpty()){
            System.out.println(p.peek().name+"-->"+p.peek().rank);
            p.remove();
        }

    }

}