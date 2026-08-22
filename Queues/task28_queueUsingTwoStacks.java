
import java.util.Stack;
public class task28_queueUsingTwoStacks {
    static class Queue{
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        public static void add(int data){//o n solution
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return s1.pop();
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return s1.peek();

        }
        public static void main(String args[]){
        new Queue();
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);
        while(!Queue.isEmpty()){
            System.out.println(Queue.peek());
            Queue.remove();
        }
        }
    }
    
}
/*
add
s1
s1--->s2
s1 push
s2--->s1

*/