import java.util.HashSet;
public class task36_union_intersection {
    public static void main(String args[]){
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        //union
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }
        System.out.println("union"+set.size());

        //intersection
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            s.add(arr1[i]);
        }
        int count=0;
        for(int i=0;i<arr2.length;i++){
            if(s.contains(arr2[i])){
                count++;
                s.remove(arr2[i]);
            }
        }
        System.out.println(count);

    }
    
}
