import java.util.Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;
public class task28_queueUsinhJCF {
    public static void main(String ags[]){
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

         Queue<Integer> dq=new ArrayDeque<>();//arrayDeque
        dq.add(1);
        dq.add(2);
        dq.add(3);
        while(!dq.isEmpty()){
            System.out.println(dq.peek());
            dq.remove();
        }

    }
    
}
