package interview.practice.collections;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String args[]) {

        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        treeSet.add(19);
        treeSet.add(2);
        treeSet.add(30);
        treeSet.add(30);
        
        for (int set : treeSet) {
            System.out.println(set);
            
        }
    }
}
