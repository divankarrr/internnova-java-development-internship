import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.LinkedHashMap;
public class task36_hashSet {
    public static void main(String args[]){
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(2);
        System.out.println(set);

        if(set.contains(2)){
            System.out.println("set contains");
        }
        if(set.contains(99)){
            System.out.println("doesnot");
        }

        //remove
        set.remove(2);

        //size
        System.out.println(set.size());

        //iteration using iterator
        HashSet<String> cities =new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Nodia");
        cities.add("Bengaluru");
        Iterator it=cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        for(String city: cities){
            System.out.println(city);
        }

        //Linked HashSet
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Nodia");
        lhs.add("Bengaluru");

        System.out.println(lhs);

        //treeset
        //sorted in ascending order
        //Null values are not allowed
        TreeSet<String> ts=new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Nodia");
        ts.add("Bengaluru");
        System.out.println(ts);

        

        //clear
        set.clear();

        //isEmpty()
        System.out.println(set.isEmpty());



    }

    
}
