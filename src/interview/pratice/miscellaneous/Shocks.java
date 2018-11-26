package interview.pratice.miscellaneous;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Shocks {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < ar.length; i++) {
			int value = 1;
			if (map.containsKey(ar[i])) {
				value = map.get(ar[i]) + 1;
			}
			map.put(ar[i], value);
		}
		int pair = 0;
		for (int val : map.values()) {
			// System.out.println(val);
			if (val >= 2) {

				pair = pair + (val / 2);
				// System.out.println(pair);
			}
		}
		return pair;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		System.out.println(sockMerchant(n, ar));

		scanner.close();
	}
}
