import java.util.*;
public class task35_connectNropes {
    public static void main(String args[]){
        int ropes[]={4,3,2,6};
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<ropes.length;i++){
            pq.add(ropes[i]);
        }
        int sum=0;
        while(pq.size()>1){
            int x=pq.remove();
            int y=pq.remove();
            sum =sum+(x+y);
            pq.add(x+y);
        }
        System.out.println(sum);
    }


    
}
