package interview.pratice.miscellaneous;

import java.util.Scanner;

/**
 * There are n bulbs, in first step all bulbs are on, in 2nd step every second bulb will be off,
 * in third step every third bulb will be off so on till n bulb, but at the time of nth bulb , nth bulb will be on.
 * Calculate the number of bulbs in on state.
 * 
 * */
public class CountBulbs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Number of bulbs on: " + countBulbs(n));
    }

    private static int countBulbs(int n) {

        int[] bulbs = new int[n];

        System.out.println("bulbs: " + bulbs.length);
        int count = n;
        int off = 0;
        int on = 1;
        for (int b = 0; b < bulbs.length; b++) {
            bulbs[b] = on;
        }
        for (int i = 2; i < n; i++) {

            for (int j = i; j <= n; j++) {

                if (j % i == 0 && bulbs[j - 1] == on) {
                    count--;
                    bulbs[j - 1] = off;
                    System.out.println("j: " + j + " " + "i: " + i + " " + "count: " + count);
                }
            }
        }
        return bulbs[n - 1] == off ? count + 1 : count;
    }

}
