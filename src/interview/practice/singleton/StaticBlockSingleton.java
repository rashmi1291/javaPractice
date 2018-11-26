package interview.practice.singleton;

public class StaticBlockSingleton {
    
    private static StaticBlockSingleton obj;
    
    private StaticBlockSingleton(){}
   
    static{
        
        try{
            obj= new StaticBlockSingleton();
        }
        catch(Exception e){
            throw new RuntimeException("Exception occured during runtime");
        }
    }
    public static StaticBlockSingleton getInstance(){
        return obj;
    }
}
