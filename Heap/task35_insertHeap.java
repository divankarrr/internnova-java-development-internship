import java.util.*;
public class task35_insertHeap{
    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();
        public void add(int data){
            //add at last idx
            arr.add(data);
            int x=arr.size()-1; //x is child index
            int par=(x-1)/2; // parent index
            while(x>0 && arr.get(x)<arr.get(par)){//O(log n)
                //swap
                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
                x=par;
                par=(x-1)/2;
            }
        }
        public int getMin(){
            return arr.get(0);
        }
        public int peek(){
            return arr.get(0);
        }
    }
    public static void main(String args[]){
        Heap h=new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        System.out.println(h.peek());

    }
}