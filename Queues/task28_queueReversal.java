import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class task28_queueReversal {
    public static void main(String args[]){
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=10;i++){
            q.add(i);
        }
        Stack<Integer> stack=new Stack<>();
        while(!q.isEmpty()){
            stack.push(q.remove());
        }
        while(!stack.isEmpty()){
            q.add(stack.pop());
        }
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
    
}
