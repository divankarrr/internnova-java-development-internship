import java.util.HashMap;
public class task36_hashMapOperations{
    public static void main(String args[]){

        //creation
        HashMap<String,Integer> map=new HashMap<>();

        //insertion
        map.put("India",102);
        map.put("China",201);
        map.put("Nepal",29);
        System.out.println(map);

        //get
        System.out.println(map.get("India"));

        //ivalid ke liye null
        System.out.println(map.get("dev"));

        //containsKey -O(1)
        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("dev"));

        //remove
        System.out.println(map.remove("China"));
        System.out.println(map);

        //size
        System.out.println(map.size());

        //isEmpty()
        System.out.println(map.isEmpty());

        //clear
        map.clear();

        System.out.println(map.size());




    }
}
/*

put(key,value)
get(key)
containsKey(key)
remove(key)
*/