package interview.practice.multithreading;

public class ThreadDemo implements Runnable{

    @Override
    public void run() {
       System.out.println("thread is Running");
        
    }
    
//    public static void main( String args[]) {
//       
//        Thread thread = new Thread();
//        thread.start();
//    }
    
  public static void main(String[] args) {
      ThreadDemo td = new ThreadDemo();
      Thread t = new Thread(td);
      t.start();
      
}  
}
