//import java.util.ArrayList;
public class task11_pairsArray {
    public static void main(String args[]){
        int arr[]={1,23,35,23,45};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")" +" ");
            }
            System.out.println();
        }

        // ArrayList<ArrayList<ArrayList<Integer>>> pairs=new ArrayList<>();
        // for(int i=0;i<arr.length;i++){
        //     ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        //     for(int j=i+1;j<arr.length;j++){
        //         ArrayList<Integer> p=new ArrayList<>();
        //         p.add(arr[i]);
        //         p.add(arr[j]);
        //         list.add(p);
        //     }
        //     pairs.add(list);
        // }
    }
}
/*
(1,23) (1,35) (1,23) (1,45) 
(23,35) (23,23) (23,45) 
(35,23) (35,45) 
(23,45) 

*/