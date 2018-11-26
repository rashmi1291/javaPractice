package interview.practice.collections;

public class ImmutablePersonDemo {
    public static void main(String[] args) {
        ImmutablePerson immutablePerson = new ImmutablePerson(1, "Rshmi");
        ImmutablePerson immutablePerson2 = immutablePerson;
        System.out.println(immutablePerson);
        System.out.println(immutablePerson2);
    }
}