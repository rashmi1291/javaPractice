package interview.pratice.miscellaneous;

import java.util.Scanner;

/**
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print
 * the respective minimum and maximum values as a single line of two space-separated long integers.
 * Hints: Beware of integer overflow! Use 64-bit Integer.
 */
public class MiniMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        long sum = 0;
        for (int s = 0; s < arr.length; s++) {
            sum = sum + arr[s];
        }

        long minSum = sum - arr[arr.length - 1];
        long maxSum = sum - arr[0];
        System.out.println(minSum + " " + maxSum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Enter five integers: ");
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
