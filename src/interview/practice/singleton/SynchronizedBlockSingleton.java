package interview.practice.singleton;

public class SynchronizedBlockSingleton {

    private static SynchronizedBlockSingleton obj;

    private SynchronizedBlockSingleton() {
    }

    public static SynchronizedBlockSingleton getInstanceUsingDoubleLocking() {

        if (obj == null) {
            synchronized (SynchronizedBlockSingleton.class) {
                if (obj == null) {
                    obj = new SynchronizedBlockSingleton();
                }
            }
        }
        return obj;
    }
}
