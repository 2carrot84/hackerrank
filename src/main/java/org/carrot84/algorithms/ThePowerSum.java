package org.carrot84.algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThePowerSum {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int X = Integer.parseInt(bufferedReader.readLine().trim());

		int N = Integer.parseInt(bufferedReader.readLine().trim());

		int result = Result.powerSum(X, N);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

	static class Result {
		private static int count = 0;

		public static int powerSum(int X, int N) {
			count = 0;
			powerSum(X, N, 0, 1);
			return count;
		}

		public static void powerSum(int X, int N, int sum, int start) {
			System.out.printf("%d %d %d%n", start, sum, X);
			if (sum == X) {
				count++;
				return;
			} else if (sum > X) {
				return;
			}

			for (int i = start; (int)Math.pow(i, N) <= X; i++) {
				int val = (int)Math.pow(i, N);
				powerSum(X, N, sum + val, i + 1);
			}
		}
	}
}

