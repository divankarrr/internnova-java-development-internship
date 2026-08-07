import java.util.Arrays;
import java.util.Collections;
public class task13_inbuiltSort {
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        Arrays.sort(arr);
        print(arr);
        Arrays.sort(arr,0,4);//start and end
        print(arr);
        
    }
    public static void reverseSort(){
        Integer arr[]={5,4,1,3,2};
        Arrays.sort(arr,Collections.reverseOrder());
        //Collections works on Objects therefore we will use Integer
        Arrays.sort(arr,0,3,Collections.reverseOrder());
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
