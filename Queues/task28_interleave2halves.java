import java.util.Queue;
import java.util.LinkedList;
public class task28_interleave2halves {
    public static void interleave(Queue<Integer> q){
        Queue<Integer> firstHalf=new LinkedList<>();
        int size=q.size();
        for(int i=0;i<size/2;i++){
            firstHalf.add(q.remove());
        }
        while(!firstHalf.isEmpty()){
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
        
    }
    public static void main(String args[]){
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=10;i++){
            q.add(i);
        }
        interleave(q);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }


    }
    
}
/*

12345678910

1 6 2 7 3 8 4 9 5 10
*/