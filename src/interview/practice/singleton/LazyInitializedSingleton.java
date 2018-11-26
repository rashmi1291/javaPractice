package interview.practice.singleton;

public class LazyInitializedSingleton {

    private static LazyInitializedSingleton obj;
    
    private LazyInitializedSingleton(){}
    
    public static LazyInitializedSingleton getInstance(){
        
        if(obj== null)
        {
            obj= new LazyInitializedSingleton();
        }        
        return obj;
    }
    
}
