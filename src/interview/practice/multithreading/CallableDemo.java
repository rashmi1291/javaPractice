package interview.practice.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//public class CallableDemo implements Callable<String> {
public class CallableDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(new Callable<String>() {
            public String call() throws Exception {

                return "Hello Callable";
            }
        });

        System.out.println("future.get() = " + future.get());

    }

    // @Override
    // public String call() throws Exception {
    //
    // return "Hello Callable";
    // }
    //
    // public static void main(String[] args) throws InterruptedException, ExecutionException {
    //
    // ExecutorService executor = Executors.newSingleThreadExecutor();
    // Future<String> future = executor.submit(new CallableDemo(){
    // public String call() throws Exception {
    //
    // return "Hello Callable";
    // }
    // });
    //
    // System.out.println("future.get() = " + future.get());
    //
    // }

}
