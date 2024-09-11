package org.carrot84.study;

import java.util.Arrays;

public class Fibonacci {

	public static int fibonacciRecursion(int n) {
		if (n < 2) {
			return n;
		}
		return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
	}

	static int[] dp = new int[100];

	static {
		Arrays.fill(dp, -1);
		dp[0] = 0;
		dp[1] = 1;
	}

	public static int fibonacciRecursionDp(int n) {
		if (dp[n] == -1) {
			dp[n] = fibonacciRecursionDp(n - 1) + fibonacciRecursionDp(n - 2);
		}
		return dp[n];
	}

	static int[] dp2 = new int[100];

	static {
		dp2[1] = 1;
	}

	public static int fibonacciDp(int n) {
		for (int i = 2; i < n + 1; i++) {
			dp2[i] = dp2[i - 1] + dp2[i - 2];
		}
		return dp2[n];
	}
}
