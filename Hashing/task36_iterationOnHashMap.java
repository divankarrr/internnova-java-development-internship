import java.util.HashMap;
import java.util.Set;
public class task36_iterationOnHashMap {
    public static void main(String args[]){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("india",102);
        map.put("china",203);
        map.put("nepal",34);
        map.put("US",89);

        //Iterate
        Set<String>keys =map.keySet();
        System.out.println(keys);

        for(String k:keys){
            System.out.println("Keys "+k+" value "+map.get(k));
        }
        
        

        //entrySet


    }
}
