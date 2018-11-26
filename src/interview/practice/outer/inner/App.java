package interview.practice.outer.inner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        System.out.println("------OuterInner class Demo -------");
        // OuterInner class Demo
        Outer outer = new Outer();
        outer.outerMethod();
        Outer.Inner inner = outer.new Inner();
        inner.innerMethod();
    }
}
