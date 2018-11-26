package interview.practice.collections;

import java.util.ArrayList;
import java.util.List;

public class FinalList {
    public static void main(String[] args) {
        final List<String> list;
        list = new ArrayList<String>();
        // COMPILATION ERROR:Local Variable Might have already been initialized
        // list = new ArrayList();
        list.add("Java");
        list.add("For");
        list.add("All");
        list.remove("Java");
        list.remove(1);
        for (Object object : list) {
            System.out.println(object);
        }
        List<String> list3 = new ArrayList<String>();
        // COMPILATION ERROR, final local variable cannot be assigned
        list3 = list;
        list.add("listNew");
        list3.add("list3New");
        System.out.println("List 3: " + list3);
        if (list ==list3) {
            System.out.println("List: " + list);
        }
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        // COMPILATION ERROR, final local variable cannot be assigned
        // list = list2;
        Integer i1 = new Integer(1);
        final Integer i2 = new Integer(2);
        list2.add(i1);
        list2.add(i2);
        list2.set(1, 3);
        for (Object object : list2) {
            System.out.println(object);
        }
    }
}
