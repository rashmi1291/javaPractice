package interview.practice.multithreading;

public class Customer {
    public static void main(String[] args) {

        final CustomerWaitNotifyExample c = new CustomerWaitNotifyExample();
        new Thread() {

            public void run() {
                c.withdraw(15000);
            }
        }.start();

        new Thread() {

            public void run() {
                c.deposit(10000);
            }
        }.start();

//        Thread t1 = new Thread() {
//            public void run() {
//                c.withdraw(15000);
//            }
//        };
//        
//        Thread t2 = new Thread() {
//            public void run() {
//                c.deposit(10000);
//            }
//        };
//        
//        t1.start();
//        t2.start();
    }
}