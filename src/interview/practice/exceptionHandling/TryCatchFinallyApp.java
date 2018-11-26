package interview.practice.exceptionHandling;

public class TryCatchFinallyApp {

    public static void main(String[] args) {

        //ThrowFromCatchBlock
        ThrowFromCatchBlock throwFromCatchBlock = new ThrowFromCatchBlock();
        System.out.println("ThrowFromCatchBlock Output: " + throwFromCatchBlock.oneOrTwo());
        
        // ReturnFromCatchBlock
        System.out.println("------ExceptionDemo -------");
        ReturnFromCatchBlock returnFromCatchBlock = new ReturnFromCatchBlock();
        System.out.println("One or two: " + returnFromCatchBlock.oneOrTwo());
        System.out.println();
    }

}
