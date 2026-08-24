import java.util.*;
public class task36_LinkedHashMap {
    public static void main(String args[]){
         //creation
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();

        //insertion
        map.put("India",102);
        map.put("China",201);
        map.put("Nepal",29);
        System.out.println(map);

        //creation
        TreeMap<String,Integer> mp=new TreeMap<>();

        //insertion
        mp.put("India",102);
        mp.put("China",201);
        mp.put("Nepal",29);
        System.out.println(mp);

    }
    
}
/*
Doubly linked list ---> LinkedHashMap
Red Black Tree ---> TreeMap
*/