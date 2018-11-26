package interview.pratice.miscellaneous;

import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {
        System.out.println("RandomeNumber " + generateSerialNumber());
    }

    private static int generateSerialNumber() {
        // int minimum = 1;
        // int maximum = 3;
        Random random = new Random();
        // int range = maximum - minimum + 1;
        return random.nextInt(3) + 1;
    }
}
