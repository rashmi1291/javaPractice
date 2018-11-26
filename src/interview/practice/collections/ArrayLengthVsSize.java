package interview.practice.collections;

public class ArrayLengthVsSize {
    protected int protectedDemo;

    int defaultDemo;

    public static void main(String[] args) {
        int[] numberOfStudent = new int[10];
        numberOfStudent[0] = 0;
        numberOfStudent[1] = 1;
        // Length is a property(field) in array, not a method
        System.out.println(numberOfStudent.length);
    }
}