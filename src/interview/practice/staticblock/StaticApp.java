package interview.practice.staticblock;

public class StaticApp {

    static int a;

    public static void main(String args[]) {
        System.out.println("Hello Main" + a);

    }

    static {
        a = 5;
        System.out.println("Hello static block");
    }
}
