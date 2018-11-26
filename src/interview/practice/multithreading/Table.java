package interview.practice.multithreading;

public class Table {

    public synchronized void printTable(int n){
        
        for(int i=0; i<=5; i++){
            System.out.println(n*i);
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {
               System.out.println(e);
            }
            
        }
    }
    
    
}
