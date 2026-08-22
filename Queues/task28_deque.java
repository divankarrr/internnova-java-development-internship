import java.util.Deque;
import java.util.LinkedList;
public class task28_deque {
    public static void main(String args[]){
        Deque<Integer> deque=new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        System.out.println("First element of deque"+deque.getFirst());
        System.out.println("Last element of dequeu"+deque.getLast());

    }
}
/*
addFirst()
addLast()
removeFirst()
removeLast()
getFirst()
getLast()
*/