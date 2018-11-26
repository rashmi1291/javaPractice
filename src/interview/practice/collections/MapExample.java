package interview.practice.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String args []){
    
    Map m = new HashMap();
    
    m.put(null, "Map1");
    m.put(null, "Map2");
    m.put(null, null);
    
    m.put(1, "Map1");
    m.put(1, "Map2");
    System.out.println(m);
}
}