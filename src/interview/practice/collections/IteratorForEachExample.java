package interview.practice.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorForEachExample {

    public static void main(String args[]) {
        ArrayList<String> personList = new ArrayList<>();

        personList.add("Jack");
        personList.add("Tom");
        personList.add("Max");

        // // Using Iterator
        // It will not give ant exception on removing elements
        Iterator<String> itr = personList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            itr.remove();
        }
        System.out.println(personList);

        // // Using ForEach loop
        // You will get concurrent modification exception
        // for (String i : personList) {
        // System.out.println(i);
        // personList.remove(i);
        // }

    }
}
