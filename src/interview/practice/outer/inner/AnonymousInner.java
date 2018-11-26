package interview.practice.outer.inner;

interface AnonymousClass {
}

public class AnonymousInner {
   static int count = 0;

    public AnonymousClass test() {
        return new AnonymousClass() {
            {
                int count = 10;
                // count = 10; (In this case the value of count will remain 11)
                System.out.println("Hello Anonymous Inner class " + ++count);
            }
        };
    }

    public static void main(String args[]) {
        AnonymousInner anonymousInner = new AnonymousInner();
        anonymousInner.test();
        System.out.println(count);
    }
}