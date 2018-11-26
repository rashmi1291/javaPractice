package interview.practice.singleton;

public class EagerSingleton {

    private static final EagerSingleton obj = new EagerSingleton();
    
    private EagerSingleton() {
    }
    
    public static EagerSingleton getInstance(){
        
        return obj;
    }
}
