import java.util.LinkedList;
public class task25_LLusingJCF {
    //create -objects  integer float character
    public static void main(String args[]){
        LinkedList<Integer> ll =new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);

        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
