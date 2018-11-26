package interview.practice.overloading;

public class OverloadingDemo {

    public int sum(int x, int y) {
        System.out.println("Inside method 1");
        return x + y;
    }

    // Compilation error:Can not overload with just return type
    // public double sum(int x, int y) {
    // return x + y;
    // }

    double sum(int x, double y) {
        System.out.println("Inside method 2");
        return x + y;
    }

    private double sum(double x, double y) {
        System.out.println("Inside method 3");
        return x + y;
    }

    public static void main(String[] args) {
        OverloadingDemo obj = new OverloadingDemo();
        System.out.println(obj.sum(3, 5));
        System.out.println(obj.sum(3, 5.0));
        System.out.println(obj.sum(3.0, 5.0));
    }
}
