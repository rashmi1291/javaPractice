package interview.practice.multithreading;

public class SynchronizationTest2 {

    
    public static void main(String[] args) {

        Table obj = new Table();

        MyThread1 myTd1 = new MyThread1(obj);
        MyThread2 myTd2 = new MyThread2(obj);

        myTd1.start();
        myTd2.start();

    }
}
