package interview.practice.multithreading;

public class MyThread1 extends Thread{
    Table t1 ;
   
   MyThread1( Table t){
       this.t1= t;
   } 
   
    public void run(){
      //  System.out.println("MyThread1");
      t1.printTable(5);
    }

}
