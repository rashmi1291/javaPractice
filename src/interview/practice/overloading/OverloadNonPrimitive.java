package interview.practice.overloading;

public class OverloadNonPrimitive {

    // In this case, String is more specific of
    // a type compared to the Object type. An Object can take any type and wrap it in an Object, whereas a String can only take a String.

    public void test(Object obj) {
        System.out.println("Object " + obj);
    }

    public void test(String s) {
        System.out.println("String " + s);
    }

    // public void test(Double d) {
    // System.out.println("Double " + d);
    // }

    // public void test(int i) {
    // System.out.println("int " + i);
    // }

    public static void main(String[] args) {

        OverloadNonPrimitive overloadNonPrimitive = new OverloadNonPrimitive();
        String s = "abc";
        Object obj = s;
        overloadNonPrimitive.test(null);
        overloadNonPrimitive.test(s);
        overloadNonPrimitive.test(obj);
        overloadNonPrimitive.test((Object) s);
        System.out.println();

    }
}