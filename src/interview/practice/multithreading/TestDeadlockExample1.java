package interview.practice.multithreading;

public class TestDeadlockExample1 {

    public static void main(String[] args) {

        final String resource1 = "Resource1";
        final String resource2 = "Resource2";

        Thread t1 = new Thread() {

            public void run() {
                synchronized (resource1) {
                    System.out.println(resource1 + " Locked by Thread1");

                    synchronized (resource2) {
                        System.out.println(resource2 + " Locked by Thread1");
                    }
                }
            }
        };

        Thread t2 = new Thread() {

            public void run() {
                synchronized (resource2) {
                    System.out.println(resource2 + " Locked by Thread2");
                    
                    synchronized (resource1) {
                        System.out.println(resource1 + " Locked by Thread2");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }

}
