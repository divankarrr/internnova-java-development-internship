import java.util.ArrayList;
import java.util.Collections;
//Collections is a class
//Collection is a interface
public class task23_ArrayList{
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        //add operation
        list.add(23);
        list.add(2);//O(1)
        list.add(1,9);
        System.out.println(list);

        //get operation
        System.out.println(list.get(1));

        //remove
        list.remove(0);//O(n)

        //set element at index O(n)
        list.set(2,10);

        //contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(3));

        //size
        System.out.println(list.size());

        //print the arraylist
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //reverse the arraylist
        for(int i=list.size()-1;i>=0;i++){
            System.out.println(list.get(i));
        }

        //maximum in arraylist
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
        System.out.println(max);

        //swap 2 numbers
        int idx1=1;
        int idx2=3;
        swap(list,idx1,idx2);
        System.out.println(list);

        //sorting an Arraylist
        Collections.sort(list);
        System.out.println(list);

        //descending
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

        //multi-dimensional arraylist
        ArrayList<ArrayList<Integer>> mat=new ArrayList<>();
        ArrayList<Integer> row1=new ArrayList<>();
        row1.add(2);
        row1.add(3);
        row1.add(4);
        mat.add(row1);
        mat.add(list);
        System.out.println(mat);

        for(int i=0;i<mat.size();i++){
            ArrayList<Integer> curr=new ArrayList<>();
            for(int j=0;j<curr.size();j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }
        

    }
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
}
/*
implementation
it double the size of arraylist

*/