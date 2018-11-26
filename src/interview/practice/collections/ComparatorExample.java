package interview.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {

    public static void main(String args[]) {
        List<Student> listOfstudents = new ArrayList<Student>();

        listOfstudents.add(new Student("Jack", 20, 101));
        listOfstudents.add(new Student("Max", 22, 104));
        listOfstudents.add(new Student("Mike", 25, 103));
        listOfstudents.add(new Student("Dave", 26, 102));

        System.out.println("Unsorted List");
        for (Student st : listOfstudents) {
            System.out.println(st.rollNo + " " + st.name + " " + st.age);
        }

        System.out.println("Sorted by Name");
        Collections.sort(listOfstudents, new NameComparator());
        for (Student st : listOfstudents) {
            System.out.println(st.rollNo + " " + st.name + " " + st.age);
        }

        System.out.println("Sorted by Age");
        Collections.sort(listOfstudents, new AgeComparator());

        for (Student st : listOfstudents) {
            System.out.println(st.rollNo + " " + st.name + " " + st.age);
        }

    }
}
