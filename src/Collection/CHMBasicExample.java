package Collection;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class CHMBasicExample {
    public static void main(String[] args) {

      // ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
    	  HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Mahesh");
        map.put(2, "Rahul");
        map.put(3, "Amit");
        map.put(null, "Raj");
      //  map.put(5, null);
       
        System.out.println(map);

        System.out.println("Value for key 2: " + map.get(2));

        map.remove(3);

        System.out.println("Map: " + map);
    }
}