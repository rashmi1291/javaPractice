package interview.pratice.miscellaneous;

/*
 * Count ways to reach the nth stair using step 1, 2 or 3.
 * */
public class CountingWaysForStairs {

	public static int countWays(int n) {
		if (n == 1 || n == 0)
			return 1;
		else if (n == 2)
			return 2;
		else
			return countWays(n - 1) + countWays(n - 2) + countWays(n - 3);

	}

	public static void main(String[] args) {
		int input = 4;
		System.out.println("Input: " + input);
		System.out.println("Ways: " + countWays(input));
	}

}
