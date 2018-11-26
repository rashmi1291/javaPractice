package interview.practice.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public static void main(String[] args) {

        // ConcurrentHashMap
        Map<String, String> chm = new ConcurrentHashMap<String, String>();

        chm.put("A", "1");
        chm.put("B", "2");
        chm.put("MM", "7");
        chm.put("XXX", "19");
        System.out.println("ConurrentHashMap before iterator" + chm);

        Iterator<String> itr = chm.keySet().iterator();
        while (itr.hasNext()) {

            String key = itr.next();
            if (key.equals("B")) {
                //chm.put(key, "5");
                chm.put(key+"new", "5");
            }
        }
        System.out.println("ConurrentHashMap after iterator" + chm);

        // HashMap
        Map<String, String> map = new HashMap<String, String>();
        map.put("11", "Hello");
        map.put("22", "Map");

        System.out.println("HashMap before iterator" + map);

        Iterator<String> iterartor = map.keySet().iterator();

        while (iterartor.hasNext()) {

            String key = iterartor.next();

            if (key.equals("22")) {
                //Here you are iterating over key and trying to modify the key itself.
                map.put(key+"new", "newMap");
               // break;
            }
        }
        System.out.println("HashMap after iterator" + map);
    }

}
