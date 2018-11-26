/**
 * 
 */
package interview.practice.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("Rashmi");
        names.add("Nainsree");
        names.add("Nimmo");

       // names.add(10);
        Iterator<String> itr = names.iterator();

        while (itr.hasNext()) {
            try {
               
                String obj = itr.next();
                
                System.out.println(obj);
            }
            catch (ClassCastException e) {
                System.out.println(e.getMessage());
            }

        }

    }

}