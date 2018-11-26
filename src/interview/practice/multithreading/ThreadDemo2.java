package interview.practice.multithreading;

public class ThreadDemo2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            // System.out.println("Thread is running");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadDemo2 t1 = new ThreadDemo2();
        ThreadDemo2 t2 = new ThreadDemo2();
        ThreadDemo2 t3 = new ThreadDemo2();
        t1.start();
        
       // t1.join(); // it causes the currently running threads to stop executing until the thread it joins with completes its task.
        t2.setDaemon(true);
        t3.start();
        t2.start();
        System.out.println(t2.isDaemon());
       
        // t2.start(); if you start a thread two times it will throw IllegalThreadStateException

        // If you directly call run, there will be no context-switching because here t1 and t2 will be treated as normal object not thread object.
        // t1.run();
        // t2.run();
    }

}
