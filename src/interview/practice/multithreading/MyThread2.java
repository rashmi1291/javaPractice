package interview.practice.multithreading;

public class MyThread2 extends Thread {
    Table t2;

    MyThread2(Table t) {
        this.t2 = t;
    }

    public void run() {
        //System.out.println("MyThread2");
        t2.printTable(100);
    }

}
