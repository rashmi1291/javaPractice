package interview.pratice.miscellaneous;

public class ExceptionDemo {

    public static void main(String[] args) {
        
        // You will not get Arithmetic exception here
        //Output: Infinity
        System.out.println("Output for 1/0.0 is " + 1 / 0.0);
        System.out.println("Output for 1.0/0 is " + 1.0 / 0);
    }

}
